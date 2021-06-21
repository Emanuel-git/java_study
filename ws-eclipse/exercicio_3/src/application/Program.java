package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		BankAccount acc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit(y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			acc = new BankAccount(accNumber, accHolder, initialDeposit);
		}
		else {
			acc = new BankAccount(accNumber, accHolder);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		
		acc.deposit(deposit);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		
		acc.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		sc.close();
	}

}
