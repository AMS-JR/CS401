package problem2.prob2B;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Galaxy S20",199.9,1);
        order1.addOrderLine("Onni Earbuds",29.9,1);
        System.out.println("\nOrders");
        System.out.println(order1);
//        Uncomment to get only order lines
//        System.out.println("\nGet Only orderlines");
//        System.out.println(order1.getOrderLines());
    }
}
