package business;

import java.io.Serializable;

/**
 * Immutable class
 */
final public class BookCopy implements Serializable {
	
	private static final long serialVersionUID = -63976228084869815L;
	private Book book;
	private int copyNum;
	private boolean isAvailable;
	public BookCopy(Book book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	
	public BookCopy(Book book, int copyNum) {
		this.book = book;
		this.copyNum = copyNum;
	}
	
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public int getCopyNum() {
		return copyNum;
	}
	
	public Book getBook() {
		return book;
	}

	
	public void changeAvailability() {
		isAvailable = !isAvailable;
	}
	public void setAvailable(boolean available) { // probably not needed
		this.isAvailable = available;
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof BookCopy)) return false;
		BookCopy copy = (BookCopy)ob;
		return copy.book.getIsbn().equals(book.getIsbn()) && copy.copyNum == copyNum;
	}
	
}
