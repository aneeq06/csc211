package myproject;

public class Shape {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		System.out.println("The circle has " + circle.getSides() + " sides.");

	}
	
	public int numSides;
	
	public Shape(int numSides) {
		this.numSides = numSides;		
	}

	public int getSides() {
		return numSides;
	}
	
	public void setSides(int numSides) {
		this.numSides = numSides;
	}
}

public class Circle extends Shape {

	public Circle() {
		super(0);
	}
}

public class Rectangle extends Shape {

	public Rectangle() {
		super(4);
	}
}
