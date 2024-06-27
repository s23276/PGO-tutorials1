import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    public List<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        this.testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        int salary = super.calculateBaseSalary();
        salary += testTypes.size() * 300;
        return salary;
    }
}
