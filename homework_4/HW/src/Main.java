import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManagers(company));
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager());

        }
        for (int i = 0; i < 40; i++) {
            company.hire(new Operator());
        }


        company.getTopSalaryStaff(10);
        company.getLowestSalaryStaff(10);
        company.fire(60);


    }
}
