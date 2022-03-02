package BankingApp;

import java.util.*;

public class Employee {

	public String name;
	public String password;
	
	static Scanner s = new Scanner(System.in);
	
	public static void ApproveOrDenyAccount(String customerName) {
		System.out.println("Primary account holder: " + customerName + 
				"\n 1 - Approve or 2 - Deny?");
		int i = s.nextInt();
		
		switch(i) {
			case 1:
				System.out.println("Customer Account Approved. ");
				break;
			case 2:
				System.out.println("Customer Account Denied. ");
		}
	}
	
}
