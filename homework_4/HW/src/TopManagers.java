public class TopManagers implements Employee {

    private final Company company;
    int money;

    public TopManagers(Company company) {
        this.company = company;
        money = 100000;
        if (company.getIncome() > 10000000) {
            money = money + ((money / 100) * 150);

        }

    }

    @Override
    public int getMonthSalary() {
        return money;
    }

    @Override
    public String toString() {
        return "Топменеджмент " +
                "Зарплата: " + money;
    }


}


