package util;

public class CurrencyConverter {
	
	public static double totalPaid(double dollarPrice, double dollarBought) {
		double total = dollarPrice * dollarBought;
		double tax = total * 0.06;
		return total + tax;
	}
}
