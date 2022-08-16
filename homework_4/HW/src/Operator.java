public class Operator implements Employee {

    int money;

    public Operator() {

        money = 40000;
    }

    @Override
    public int getMonthSalary() {
        return money;
    }

    @Override
    public String toString() {
        return "Оператор: " + "зарпалата: " + money;
    }
}




