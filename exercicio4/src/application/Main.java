package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dp = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double db = sc.nextDouble();
		double total = CurrencyConverter.totalPaid(dp, db);
		System.out.printf("Amount to be paid in reais = %.2f", total);
		
		sc.close();

	}

}
