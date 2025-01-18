package partC.payroll;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee(1, 5000.0);

        Paycheck salariedEmployeePaycheck = salariedEmployee.calcCompensation(1,2025);
        System.out.println(salariedEmployee.print());
        System.out.println(salariedEmployeePaycheck.print());

        Employee hourlyEmployee = new HourlyEmployee(1, 20,20);

        Paycheck hourlyEmployeePaycheck = hourlyEmployee.calcCompensation(1,2025);
        System.out.println(hourlyEmployee.print());
        System.out.println(hourlyEmployeePaycheck.print());

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee(2,2000.0,0.10);
        Order order1 = new Order(1, LocalDate.now(), 299.9, commissionedEmployee);
        Order order2 = new Order(2, LocalDate.of(2025, 1, 20), 500.0, commissionedEmployee);
        commissionedEmployee.addOrder(order1);
        commissionedEmployee.addOrder(order2);
        Paycheck commissionedEmployeePaycheck = commissionedEmployee.calcCompensation(1,2025);
        System.out.println(commissionedEmployee.print());
        System.out.println(commissionedEmployeePaycheck.print());

    }
}

