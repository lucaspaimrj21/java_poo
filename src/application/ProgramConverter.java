package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double converted = CurrencyConverter.converter(dollarPrice, dollars);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", converted);
		
		
		sc.close();

	}

}
