package BankingApp;

import java.io.*;
import java.util.*;

public class Admin extends Employee {
	
	final static String outputFilePath = "./Project0/src/Serialization.txt";
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	File file = new File(outputFilePath);	//create file object

	static Scanner s = new Scanner(System.in);
	
	public static void CloseAccount() {
		System.out.println("Please enter the name of the User whose Account you would like to Close: ");
		String userAccountName = s.nextLine();
		System.out.println("Are you sure you want to close the account of " + userAccountName + "? \n1 - Yes, 2 - No ");
		int answer = s.nextInt();
		
		if (answer == 1) {
			//Remove userAccountName from the collection
		} else {
			System.out.println("The User Account will not be closed. ");
		}
	}
	
}
