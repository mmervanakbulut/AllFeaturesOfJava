package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName; // this shows class varibale
		this.lastName = lastName;
		
		System.out.println("Email Created: " + this.firstName +" " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(8);
		System.out.println("your password is: "+this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() 
				+ "." 
				+ lastName.toLowerCase() 
				+ "@"
				+ department
				+ "."
				+ companySuffix;
		System.out.println("your email is: " + email);
		
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n"
				+ "1 for Sales\n"
				+ "2 for Development\n"
				+ "3 for Accounting\n"
				+ "0 for none\n"
				+ "Enter department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return "";}
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRQSTUWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length;i++) {
			int rand = (int) (Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "Display Name: "
				+ firstName
				+ "Company Email: "
				+ email
				+ "Mailbox Capacity: "
				+ mailboxCapacity 
				+ "mb";
	}
	
	
}
