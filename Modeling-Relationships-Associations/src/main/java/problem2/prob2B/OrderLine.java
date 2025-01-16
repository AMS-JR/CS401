package problem2.prob2B;

public class OrderLine {
    private String product;
    private double cost;
    private int quantity;
    private Order order;
    public OrderLine(String product, double cost, int quantity, Order order) {
        this.product = product;
        this.cost = cost;
        this.quantity = quantity;
        this.order = order;
    }
    public String toString() {
        return "OrderLine{" +
                "product='" + product + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}
