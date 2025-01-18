package partC.payroll;

public abstract class Employee {
    private int empId;

    public Employee(int empId) {
        this.empId = empId;
    }
    public Paycheck calcCompensation(int month, int year) {
        // Implement this method in subclasses
        double grossPay = calcGrossPay(month, year);

        double FICA = 0.23*grossPay;
        double state = 0.05*grossPay;
        double local = 0.01*grossPay;
        double medicare = 0.03*grossPay;
        double socialSecurity = 0.075*grossPay;

        return new Paycheck(grossPay, FICA, state, local, medicare, socialSecurity);
    }
    public abstract double calcGrossPay(int month, int year);
    public String print() {
        return "Employee{" +
                "empId=" + empId +
                '}';
    }
}
