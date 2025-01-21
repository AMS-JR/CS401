package lesson5.labs.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//use a factory method
	private Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	public static Order newOrder(LocalDate date) {
		if(date == null) throw new NullPointerException("Null date");
		Order ord = new Order(date);
		return ord;
	}
	public void addItem(String name){
		items.add(Item.createItem(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
