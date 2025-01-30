package prob1.Project4_Students.src.business;

import java.util.*;
import java.util.stream.Collectors;

import prob1.Project4_Students.src.dataaccess.DataAccess;
import prob1.Project4_Students.src.dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingOverdueBook());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		return mems.stream()
				.filter(mem -> mem.getAddress().getZip().contains("3"))
				.map(mem -> mem.getMemberId())
				.collect(Collectors.toList());
		
	}
	//Returns a list of all ids of  LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		// This assumes the LibraryMember class has a method hasOverdueBook()
		// Which I added
		return members.stream()
				.filter(LibraryMember::hasOverdueBook) // Filter members with overdue books
				.map(LibraryMember::getMemberId)       // Extract member IDs
				.collect(Collectors.toList());

	}
	
	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		return bs.stream()
				.filter(b -> b.getAuthors().size() > 1)
				.map(b -> b.getIsbn())
				.collect(Collectors.toList());
		
		}

}
