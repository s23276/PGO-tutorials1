public class StudyProgramme {
    private String programName;
    private String programDescription;
    private int numberOfSemesters;
    private int maxITN;

    public StudyProgramme(String programName, String programDescription, int numberOfSemesters, int maxITN) {
        this.programName = programName;
        this.programDescription = programDescription;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITN = maxITN;
    }


    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getMaxITN() {
        return maxITN;
    }

    public void setMaxITN(int maxITN) {
        this.maxITN = maxITN;
    }
}
