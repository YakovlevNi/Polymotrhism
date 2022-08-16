public class Manager implements Employee {


    int money;


    public Manager() {

        money = (int) (115000 + (Math.random() * 25000));
    }

    @Override
    public int getMonthSalary() {
        return money;

    }

    @Override
    public String toString() {
        return "Менеджер " +
                "Зарплата: " + money;
    }
}


