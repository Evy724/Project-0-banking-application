package BankingApp;

import java.util.*;

public class Customer {

	private String customerName;
	private String accountType;
	private long balance;
	
	Scanner s = new Scanner(System.in);
	
	public void OpenAccount() {	//Method to open a new Customer Account
		
		System.out.println("Please enter your name: ");
		customerName = s.nextLine();
		
		System.out.println("Please enter account type: ");
		accountType = s.nextLine();
			
		System.out.println("Please enter initial balance: ");
		balance = s.nextLong();
	}
	
	
	
	public void ShowAccount() {
		
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
	
}
