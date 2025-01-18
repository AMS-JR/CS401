package partC.payroll;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;
    private Employee commissionedEmployee;
    public Order(int orderNo, LocalDate orderDate, double orderAmount, Employee commissionedEmployee) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.commissionedEmployee = commissionedEmployee;
    }
    public double getOrderAmount() {
        return orderAmount;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", orderDate=" + orderDate +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
