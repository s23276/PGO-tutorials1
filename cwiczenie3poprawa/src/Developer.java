import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    public List<Technology> technologies;

    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        this.technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        int salary = super.calculateBaseSalary();
        for (Technology tech : technologies) {
            salary += tech.bonus;
        }
        return salary;
    }
}
