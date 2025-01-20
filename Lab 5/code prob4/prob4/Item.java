package lesson5.labs.prob4;

public class Item {
	String name;
	private Item(String name) {
		this.name = name;
	}
	public static Item createItem(String name) {
		if(name == null) throw new NullPointerException("Null name passed");
        return new Item(name);
    }
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
