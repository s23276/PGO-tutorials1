import java.time.LocalDate;

public class Employee {
    public String firstName;
    public String lastName;
    public String address;
    public String email;
    public String pesel;
    public int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateBaseSalary() {
        int currentYear = LocalDate.now().getYear();
        int yearsWorked = currentYear - this.yearOfEmployment;
        return 3000 + (yearsWorked * 1000);
    }

    public int calculateSalary() {
        return calculateBaseSalary();
    }
}
