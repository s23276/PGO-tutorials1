import java.time.LocalDate;

public class Goal {
    public LocalDate date;
    public String name;
    public int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.date = LocalDate.of(year, month, day);
        this.name = name;
        this.bonus = bonus;
    }
}
