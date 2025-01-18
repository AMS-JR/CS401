package partC.payroll;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {
    private double baseSalary;
    private double commission;
    private List<Order> orders;
    public CommissionedEmployee(int empId,double baseSalary, double commission) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        // implement or modify
        orders.add(order);
    }
    @Override
    public double calcGrossPay(int month, int year) {
        // In order to calculate the paycheck for a Commissioned employee you need to access all
        //the Order objects that each Commissioned employee is responsible for and add up the
        //order amount of all orders during a given month
        double totalOrderAmount = 0.0;
        // implement or modify
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }

    @Override
    public String print() {
        return "CommissionedEmployee{" +
                "baseSalary=" + baseSalary +
                ", commission=" + commission +
                ", orders=" + orders +
                "} " + super.print();
    }
}
