package BankingApp;

import java.util.*;

public class BankingAppMain {
	
	static Scanner s = new Scanner(System.in);
	static Customer customer = new Customer();
	static Employee employee = new Employee();
	static BankLogIn bl = new BankLogIn();

	public static void main(String[] args) {
			
		do {	
			System.out.println("Welcome to Jones Bank \nPlease choose an option: "
					+ "\n1 - Open an account, 2 - User Login, 3 - Employee Login, 4 - Exit ");
			
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
				break;
				case 4:
					System.out.println("Goodbye! ");
					System.exit(0);
				default:
					System.out.println("Please choose 1, 2, or 3, or 4. ");
			}
		} while (true);
	}
	
	public static void CustomerMenu() {
		boolean input = false;
		do {
			System.out.println("Please make a selection: "
					+ "\n1 - Show Account details, 2 - Deposit, 3 - Withdraw, 4 - Log out");
			int i = s.nextInt();
			switch (i) {
				case 1:
					customer.ShowAccount(Customer.getCustomerName());
				case 2:
					
				case 3:
				case 4:
					BankLogIn.LogOut();
				default:
					System.out.println("Please choose 1, 2, 3, or 4. ");
					
				
		}
		} while (input == false); 
	}
}