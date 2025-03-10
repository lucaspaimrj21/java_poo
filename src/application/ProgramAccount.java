package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter the initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: " + "\n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated data: " + "\n" + account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Updated data: " + "\n" + account);
		
		sc.close();

	}

}
