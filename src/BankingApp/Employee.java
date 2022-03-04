package BankingApp;

import java.io.*;
import java.util.*;

public class Employee extends Customer {
	
	final static String inputFilePath = "./Project0/src/Serialization.txt";
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	File file = new File(inputFilePath);	//create file object
	
	FileReader fr = null;
	
	static Scanner s = new Scanner(System.in);
	
	public static void ApproveOrDenyAccount() {
		boolean input = false;
		do {
			System.out.println("Please input the first name of the applicant: ");
			String customerName = s.nextLine();
			System.out.println("Primary account holder: " + customerName + 
							"\n 1 - Approve or 2 - Deny? ");
			int i = s.nextInt();
			switch(i) {
				case 1:
					System.out.println("Customer Account Approved. ");
					input = true;
				case 2:
					System.out.println("Customer Account Denied. ");
					input = true;
				default:
					System.out.println("Please input 1 or 2. ");
			}		
		} while(input == false);
	}

}
