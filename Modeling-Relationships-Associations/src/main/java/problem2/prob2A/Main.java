package problem2.prob2A;

public class Main {
    public static void main(String[] args) {
        Student amadu = new Student("Amadu");
        Student aisha = new Student("Aisha");
        amadu.getReport().setGrade("A");
        aisha.getReport().setGrade("B");
        System.out.println(amadu);
        System.out.println(aisha);
    }
}
