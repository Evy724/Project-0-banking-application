package BankingApp;

import java.util.*;

public class Customer {

	private static String customerName;
	private String jointCustomerName;
	private String accountType;
	private long balance;
	
	Scanner s = new Scanner(System.in);
	
	public void OpenAccount() {	//Method to open a new Customer Account
		
		System.out.println("Please enter your name: ");
		setCustomerName(s.nextLine());
		
		System.out.println("Please enter account type: \n1 - Personal, 2 - Joint");
		accountType = s.nextLine();
		if(accountType.equals("Joint")) {
			System.out.println("Please enter the second Customer Name on the account: ");
			setJointCustomerName(s.nextLine());
		}
			
		System.out.println("Please enter initial balance: ");
		balance = s.nextLong();
	}
	
	
	
	public void ShowAccount(String customerName) {
		
		System.out.println("The account holder is: " + customerName);
		System.out.println("The account type is: " + accountType);
		System.out.println("The account balance is: $" + balance);
		
	}
	
	public void Deposit() {
		
		long depositAmount;
		System.out.println("How much would you like to deposit? ");
		depositAmount = s.nextLong();
		balance = balance + depositAmount;
		System.out.println("Your new balance is: " + balance);
	}
	
	public void Withdraw() {
		
		long withdrawAmount;
		System.out.println("How much would you like to withdraw? ");
		withdrawAmount = s.nextLong();
		balance = balance - withdrawAmount;
		System.out.println("Your new balance is: " + balance);
	}



	public static String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		Customer.customerName = customerName;
	}

	public String getJointCustomerName() {
		return jointCustomerName;
	}

	public void setJointCustomerName(String jointCustomerName) {
		this.jointCustomerName = jointCustomerName;
	}
	
}
