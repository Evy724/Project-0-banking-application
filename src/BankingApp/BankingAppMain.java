package BankingApp;

import java.util.*;

public class BankingAppMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Jones Bank \nPlease choose an option: "
				+ "\n1 - Open an account, 2 - User Login, 3 - Employee Login");
		
		int n = s.nextInt();
		switch (n) {
			case 1:
				Customer customer = new Customer();
				customer.OpenAccount();
//				customer.CreateUserAccount();
				break;
			case 2:
				BankLogIn userLogin = new BankLogIn();
				userLogin.LogIn();
			case 3:
				Employee employeeLogin = new Employee();
//				employeeLogin.LogIn();
		}
	}
}
