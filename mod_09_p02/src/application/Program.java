package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		String accountNumber = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there na initial deposit?(y/n) ");
		char resp = sc.next().charAt(0);
		double deposit;
		double withdraw;
		
		if(resp == 'y') {
			System.out.print("Enter initial value: ");
			deposit = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, deposit);
			
		} else {
			account = new Account(accountNumber, accountHolder);		
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		// account operations
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}

}
