package inheritance.without.override;

public class Circle extends Shape {
	
	// Shape·ÎºÎÅÍ ¹°·Á¹Ş´Â ¸â¹ö
	/*
	double area;
	void display() {...}
	double getArea() {...}
	*/
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void makeAC() {
		area = Math.PI * Math.pow(radius, 2);	// Math.pow(a, b) => aÀÇ b½Â
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
