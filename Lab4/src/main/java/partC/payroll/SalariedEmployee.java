package partC.payroll;

import java.util.ArrayList;
import java.util.List;

public class SalariedEmployee extends Employee {
    private double salary;
    public SalariedEmployee(int empId,double salary) {
        super(empId);
        this.salary = salary;
    }
    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }

    @Override
    public String print() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                "} " + super.print();
    }
}
