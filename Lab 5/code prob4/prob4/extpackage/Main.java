package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.CustOrderFactory;
import lesson5.labs.prob4.Customer;
import lesson5.labs.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(LocalDate.now());
		cust.addOrder(order);
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.createOrder(LocalDate.now());
		cust.addOrder(order);
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
