import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Company {

    int moneyAmount;

    List<Employee> list = new ArrayList<>();

    public void hire(Employee employee) {
        list.add(employee);
        //System.out.println("Наняли еще одного человека");
    }

    public void hireAll(List<Employee> employees) {
        list.addAll(employees);
        System.out.println("На работу приняли весь коллектив");
    }

    public void fire(int count) {
        if (count <= list.size()) {
            for (int x = 0; x < count; x++) {
                list.remove((int) Math.random() * list.size());
            }
        }
        System.out.println("Уволили " + count + " человек" + "\n" + "Размер коллектива:" + list.size() + " человек");


    }

    public int getIncome() {
        moneyAmount = (int) (Math.random() * 30000000);
        //System.out.println("Прибыль компании: " + moneyAmount);
        return moneyAmount;

    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> topSalaryStaff = new ArrayList<>(list);
        topSalaryStaff.sort((Comparator.comparing(Employee::getMonthSalary).reversed()));
        System.out.println("Размер коллектива: " + list.size() + " человек");
        System.out.println(("Сортировка по наибольшим зарплатам: " + topSalaryStaff.subList(0, count)));
        return topSalaryStaff.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {

        List<Employee> lowestSalaryStaff = new ArrayList<>(list);
        lowestSalaryStaff.sort(Comparator.comparing(Employee::getMonthSalary));
        System.out.println("Сортировка по наименьшим зарплатам: " + lowestSalaryStaff.subList(0, count));
        return lowestSalaryStaff.subList(0, count);
    }


}

