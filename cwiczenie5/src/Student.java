import java.time.LocalDate;

public class Student extends Person {
    private static int nextIndexNumber = 1;
    private int indexNumber;
    private StudyProgramme studyProgramme;
    private int currentSemester;

    public Student(String firstName, String lastName, String email, String address, LocalDate dateOfBirth) {
        super(firstName, lastName, email, address, dateOfBirth);
        this.indexNumber = nextIndexNumber++;
        this.currentSemester = 1;
    }


    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }


    public void addGrade(int grade, String courseName) {

    }


    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters()) {
            currentSemester++;
        } else {

        }
    }


    public int getIndexNumber() {
        return indexNumber;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }
}
