package BankingApp;

import java.util.Scanner;

public class BankLogIn extends Customer {
	
	public String userName;
	public String password;
	public String inputUserName;
	public String inputPassword;
	
	Scanner s = new Scanner(System.in);
	
	public void CreateUserAccount() {
		System.out.println("Please create your username: ");
		String userName = s.nextLine();
		System.out.println("Your username is: " + userName);
	
		System.out.println("Please create a password: ");
		String password = s.nextLine();
		System.out.println("Your password is: " + password);
		}
	
	public void LogIn() {
	
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
				System.out.println("Login successful. ");
			} else {
				System.out.println("Login failed: invalid password ");
				System.exit(0);
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
