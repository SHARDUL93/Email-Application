package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "xyzcompany.com";

	// constructors
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED : " + this.firstName + " " +
		// this.lastName);

		this.department = setDepartment();
		// System.out.println("Department : " + this.department);

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your email is : " + email);

	}

	// department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + "." + "\nDepartment Codes -" + "\n1. for SALES"
				+ "\n2. for DEVELOPMENT" + "\n3. for ACCOUNTING" + "\n0. for NONE" + "\nEnter the department :");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return "";
		}

	}

	// random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;

	}

	// alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;

	}

	// change password
	public void changePassword(String password) {
		this.password = password;

	}

	// getters
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	// showInfo
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + " MB";

	}
}
