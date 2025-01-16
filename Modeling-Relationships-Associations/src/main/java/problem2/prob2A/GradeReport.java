package problem2.prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    public GradeReport(String grade, Student student) {
        this.grade = grade;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + student.getName() +
                ", grade=" + grade +
                "}";
    }
}
