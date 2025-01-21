package lesson5.labs.prob4;

import java.time.LocalDate;

public final class CustOrderFactory {
    private CustOrderFactory() { }
    public static Customer createCustomer(String name) {
        return Customer.newCustomer(name);
    }
    public static Order createOrder(LocalDate date) {
        return Order.newOrder(date);
    }
}
