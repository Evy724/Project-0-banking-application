package BankingApp;

import java.io.*;
import java.util.*;

public class BankLogIn extends BankingAppMain {
	
	final static String outputFilePath = "/Project0/src/Serialization.txt";
	
	public String userName;
	public String password;
	public String inputUserName;
	public String inputPassword;
	
	public String employee;
	public String employeePassword;
	public String inputEmployeeUserName;
	public String inputEmployeePassword;

	Scanner s = new Scanner(System.in);
	
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	File file = new File(outputFilePath);	//create file object
	
	BufferedWriter bf = null; 
	
	public void CreateUserAccount() {
		System.out.println("Please create your username: ");
		String userName = s.nextLine();
		System.out.println("Your username is: " + userName);
	
		System.out.println("Please create a password: ");
		String password = s.nextLine();
		map.put(userName, password);
		try {
			bf = new BufferedWriter(new FileWriter(file));
			bf.write(userName + ":" + password);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Your password is: " + password + "\nAn Employee will review your application");
		
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
	
	public static void LogOut() {
		System.out.println("Goodbye! ");
		System.exit(0);
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
				Employee.EmployeeMenu();
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
				System.out.println("Login successful, welcome admin.");
			} else {
				System.out.println("Login failed: invalid password ");
				System.exit(0);
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
