package BankingApp;

import java.util.*;

public class Employee extends Customer {
	
	static Scanner s = new Scanner(System.in);
	
	public static boolean ApproveOrDenyAccount(String customerName) {
		
		boolean isApproved = false;
		
		while(isApproved==false) {
			
			System.out.println("Primary account holder: " + customerName + 
							"\n 1 - Approve or 2 - Deny? ");
			int i = s.nextInt();
		
			switch(i) {
				case 1:
					System.out.println("Customer Account Approved. ");
					isApproved = true;
					return true;
				case 2:
					System.out.println("Customer Account Denied. ");
					return false;
				default:
					System.out.println("Please input 1 or 2. ");
			}		
		
		}
		return isApproved;
	}
	
}
