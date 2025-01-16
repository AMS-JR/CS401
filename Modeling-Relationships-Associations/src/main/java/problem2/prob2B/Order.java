package problem2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLines;
    public Order(int orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }
    public void addOrderLine(String product, double cost, int quantity) {
        OrderLine ordLine = new OrderLine(product,cost, quantity, this);
        orderLines.add(ordLine);
    }
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", orderLines=" + orderLines +
                '}';
    }
}
