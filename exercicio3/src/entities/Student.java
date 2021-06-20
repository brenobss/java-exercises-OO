package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double finalNote() {
		return this.n1 + this.n2 + this.n3;
	}
	
	public void passOrFailed () {
		if(this.finalNote() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.printf("FAILED%nMISSING %.2f POINTS", 60.00 - this.finalNote());
		}
	}
}
