package inheritance.without.override;

public class Circle extends Shape {
	
	// Shape�κ��� �����޴� ���
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
		area = Math.PI * Math.pow(radius, 2);	// Math.pow(a, b) => a�� b��
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
