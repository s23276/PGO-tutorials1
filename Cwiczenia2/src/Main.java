public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "12345", "jan.kowalski@gmail.com", "Marszalkowska 1");
        Student student2 = new Student("Anna", "Wisniewska", "67890", "anna.wisniewska@gmail.com", "Pulawska 1");

        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student1.addGrade(5.0);

        student2.addGrade(2.0);
        student2.addGrade(2.5);
        student2.addGrade(3.0);

        System.out.println("Average for student1: " + student1.calculateAverage());
        System.out.println("Average for student2: " + student2.calculateAverage());

        StudentGroup group = new StudentGroup("Group A");
        group.addStudent(student1);
        group.addStudent(student2);

        System.out.println(group);
    }
}
