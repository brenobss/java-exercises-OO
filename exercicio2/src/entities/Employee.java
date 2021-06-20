package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double percent = percentage / 100.00;
		double newSalary = ((this.grossSalary * percent) + this.grossSalary) - tax;
		System.out.printf("Updated data: " + this.name + ", $ %.2f",  newSalary);
	}
}
