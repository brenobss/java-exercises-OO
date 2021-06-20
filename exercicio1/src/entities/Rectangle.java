package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area(double width, double height) {
		return width * height;
	}
	
	public double perimeter(double width, double height) {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal(double width, double height) {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public void printTotal() {
		System.out.printf("AREA = %.2f%n", this.area(this.width, this.height));
		System.out.printf("PERIMETER = %.2f%n", this.perimeter(this.width, this.height));
		System.out.printf("DIAGONAL = %.2f%n", this.diagonal(this.width, this.height));
		
	}
	
}
