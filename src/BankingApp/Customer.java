package BankingApp;

import java.io.*;
import java.util.*;

public class Customer {
	
	final static String outputFilePath = "./Project0/src/Serialization.txt";

	private static String customerName;
	private String jointCustomerName;
	private String accountType;
	private Long balance;
	
	Scanner s = new Scanner(System.in);
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	File file = new File(outputFilePath);	//create file object
	
	BufferedWriter bw = null; 
	
	public void OpenAccount() {	//Method to open a new Customer Account
		
		try {
			bw = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter your name: ");
		setCustomerName(s.nextLine());
		System.out.println("Please enter account type: \n1 - Personal, 2 - Joint");
		accountType = s.nextLine();
		if(accountType.equals("Joint")) {
			System.out.println("Please enter the second Customer Name on the account: ");
			setJointCustomerName(s.nextLine());
		}
		map.put(customerName, accountType);
		try {
			bw.write(customerName + ":" + accountType);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter initial balance: ");
		balance = s.nextLong();
		String balanceString = balance.toString();
		map.put(customerName, balanceString);
		try {
			bw.write(customerName + ":" + balanceString);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				System.exit(0);
			} catch (Exception e) {
				
			}
		}
		
	}
	
	
	
	public void ShowAccount(String customerName) {
		
		System.out.println("The account holder is: " + customerName);
		System.out.println("The account type is: " + accountType);
		System.out.println("The account balance is: $" + balance);
		
	}
	
	public void Deposit() {
		try {
			bw = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long depositAmount;
		System.out.println("How much would you like to deposit? ");
		depositAmount = s.nextLong();
		balance = balance + depositAmount;
		System.out.println("Your new balance is: " + balance);
		String balanceString = balance.toString();
		map.put(customerName, balanceString);
		try {
			bw.write(customerName + ":" + balanceString);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	public void Withdraw() {
		try {
			bw = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long withdrawAmount;
		System.out.println("How much would you like to withdraw? ");
		withdrawAmount = s.nextLong();
		balance = balance - withdrawAmount;
		System.out.println("Your new balance is: " + balance);
		String balanceString = balance.toString();
		map.put(customerName, balanceString);
		try {
			bw.write(customerName + ":" + balanceString);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				
			}
		}
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
