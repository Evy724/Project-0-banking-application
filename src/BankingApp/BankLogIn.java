package BankingApp;

import java.util.Scanner;

public class BankLogIn extends Customer {
	
	public String userName;
	public String password;
	public String inputUserName;
	public String inputPassword;
	
	public String employee;
	public String employeePassword;
	public String inputEmployeeUserName;
	public String inputEmployeePassword;

	Scanner s = new Scanner(System.in);
	
	public void CreateUserAccount() {
		System.out.println("Please create your username: ");
		String userName = s.nextLine();
		System.out.println("Your username is: " + userName);
	
		System.out.println("Please create a password: ");
		String password = s.nextLine();
		System.out.println("Your password is: " + password);
		}
	
	public void CustomerLogIn() {
	
		System.out.println("Enter username to log in: ");
		String inputUserName = s.nextLine();
	
		try {
			validateUserName(inputUserName, userName);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("Enter password: ");
		String inputPassword = s.nextLine();
	
		try {
			validatePassword(inputPassword, password);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void EmployeeLogIn() {
		
		System.out.println("Enter username to log in: ");
		String inputEmployeeUserName = s.nextLine();
	
		try {
			validateUserName(inputEmployeeUserName);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("Enter password: ");
		String inputEmployeePassword = s.nextLine();
	
		try {
			validatePassword(inputEmployeePassword);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void validateUserName(String inputUserName, String userName) throws IllegalArgumentException {
		try {
			if(inputUserName.equalsIgnoreCase(userName)) {
				
			} else {
				System.out.println("Login failed: invalid username");
				System.exit(0);
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void validatePassword(String inputPassword, String password) throws IllegalArgumentException {
		try {
			if(inputPassword.equals(password)) {
				System.out.println("Login successful, welcome customer. ");
			} else {
				System.out.println("Login failed: invalid password ");
				System.exit(0);
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void validateUserName(String inputEmployeeUserName) throws IllegalArgumentException {
		try {
			if(inputEmployeeUserName.equalsIgnoreCase("employee")) {
				
			} else if(inputEmployeeUserName.equalsIgnoreCase("admin")) {
				
			} else {
				System.out.println("Login failed: invalid username");
				System.exit(0);
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void validatePassword(String inputEmployeePassword) throws IllegalArgumentException {
		try {
			if(inputEmployeePassword.equals("employeePassword")) {
				System.out.println("Login successful, welcome employee.");
				
			} else if(inputEmployeePassword.equals("adminPassword")) {
				
			} else {
				System.out.println("Login failed: invalid password ");
				System.exit(0);
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
