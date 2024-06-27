import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentList = new ArrayList<>();


    public static void addStudent(Student student) {
        studentList.add(student);
    }


    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }


    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Index Number: " + student.getIndexNumber());
            System.out.println("Current Semester: " + student.getCurrentSemester());
            System.out.println("Program Name: " + student.getStudyProgramme().getProgramName());
            System.out.println("---------------------------------------------");
        }
    }
}
