package problem2.prob2A;

public class Student {
    private String name;
    private GradeReport report;
    public Student(String name, String grade) {
        this.name = name;
        this.report = new GradeReport(grade, this);
    }
    public String getName() {
        return name;
    }
    public GradeReport getReport() {
        return report;
    }
}
