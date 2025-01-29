package prob1.Project4_Students.src.dataaccess;

import java.util.HashMap;

import prob1.Project4_Students.src.business.Book;
import prob1.Project4_Students.src.business.LibraryMember;

public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
