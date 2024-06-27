import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    public List<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goals = new ArrayList<>();
    }

    public void addGoals(Goal goal) {
        this.goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int salary = super.calculateBaseSalary();
        LocalDate currentDate = LocalDate.now();
        for (Goal goal : goals) {
            if (goal.date.getMonthValue() == currentDate.getMonthValue() && goal.date.getYear() == currentDate.getYear()) {
                salary += goal.bonus;
            }
        }
        return salary;
    }
}
