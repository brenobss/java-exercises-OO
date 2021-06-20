package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: " + emp.name + ", $ %.2f%n", emp.netSalary());
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		emp.increaseSalary(percentage);
		
		sc.close();

	}

}
