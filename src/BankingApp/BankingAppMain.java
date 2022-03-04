package BankingApp;

import java.util.*;

public class BankingAppMain {
	

	static BankLogIn bl = new BankLogIn();
	static Customer customer = new Customer();
	static Employee employee = new Employee();
	static Admin admin = new Admin();
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
			
		do {	
			System.out.println("Welcome to Jones Bank \nPlease choose an option: "
					+ "\n1 - Open an account, 2 - User Login, 3 - Employee Login, 4 - Admin Login, 5 - Exit ");
			
			int n = s.nextInt();
			switch (n) {
				case 1:
					bl.CreateUserAccount();
					customer.OpenAccount();
					break;	
				case 2:
					bl.CustomerLogIn();
					CustomerMenu();
					break;
				case 3:
					bl.EmployeeLogIn();
					EmployeeMenu();
					break;
				case 4:
					bl.EmployeeLogIn();
					AdminMenu();
				case 5:
					System.out.println("Goodbye! ");
					System.exit(0);
				default:
					System.out.println("Please choose a valid option. ");
			}
		} while (true);
	}
	
	public static void CustomerMenu() {
		boolean input = false;
		do {
			System.out.println("Please make a selection: "
					+ "\n1 - Show Account details, 2 - Deposit, 3 - Withdraw, 4 - Log out ");
			int i = s.nextInt();
			switch (i) {
				case 1:
					customer.ShowAccount(Customer.getCustomerName());
					break;
				case 2:
					customer.Deposit();
					break;
				case 3:
					customer.Withdraw();
					break;
				case 4:
					BankLogIn.LogOut();
				default:
					System.out.println("Please choose a valid option. ");			
			}
		} while (input == false); 
	}
	
	public static void EmployeeMenu() {
		boolean input = false;
		do {
			System.out.println("Please make a selection: "
					+ "\n1 - Approve Or Deny an Application, 2 - Log out");
			int i = s.nextInt(); 
			switch(i) {
				case 1:
					Employee.ApproveOrDenyAccount();
				case 2:
					BankLogIn.LogOut();
				default:
					System.out.println("Please choose a valid option. ");
			}
		} while (input == false);
	}
	
	public static void AdminMenu() {
		boolean input = false;
		do {
			System.out.println("Please make a selection: "
					+ "\n1 - Approve Or Deny an Application, 2 - Close an Account, 3 - Log out");
			int i = s.nextInt();
			switch(i) {
				case 1:
					Employee.ApproveOrDenyAccount();
				case 2:
					Admin.CloseAccount();
				case 3:
					BankLogIn.LogOut();
				default:
					System.out.println("Please choose a valid option. ");
			}
		} while (input == false);
	}
}