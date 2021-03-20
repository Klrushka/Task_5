public class Student extends Person {
    private int studentNumber;
    private double averageMark;
    private Boolean isEligibleToEnroll;
    private Boolean GetSeminarsTaken;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Boolean getEligibleToEnroll() {
        return isEligibleToEnroll;
    }

    public void setEligibleToEnroll(Boolean eligibleToEnroll) {
        isEligibleToEnroll = eligibleToEnroll;
    }

    public Boolean getGetSeminarsTaken() {
        return GetSeminarsTaken;
    }

    public void setGetSeminarsTaken(Boolean getSeminarsTaken) {
        GetSeminarsTaken = getSeminarsTaken;
    }
}
