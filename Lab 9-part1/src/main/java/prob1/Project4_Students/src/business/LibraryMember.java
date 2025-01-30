package prob1.Project4_Students.src.business;

import java.io.Serializable;
import java.time.LocalDate;


import prob1.Project4_Students.src.dataaccess.DataAccess;
import prob1.Project4_Students.src.dataaccess.DataAccessFacade;

final public class LibraryMember extends Person implements Serializable {
	private String memberId;
	
	public LibraryMember(String memberId, String fname, String lname, String tel,Address add) {
		super(fname,lname, tel, add);
		this.memberId = memberId;		
	}
	
	
	public String getMemberId() {
		return memberId;
	}

	
	
	@Override
	public String toString() {
		return "Member Info: " + "ID: " + memberId + ", name: " + getFirstName() + " " + getLastName() + 
				", " + getTelephone() + " " + getAddress();
	}
	public boolean hasOverdueBook() {
		// Logic to check if the member has an overdue book
		// For example, check their checkout records
		return false; // Placeholder
	}

	private static final long serialVersionUID = -2226197306790714013L;
}
