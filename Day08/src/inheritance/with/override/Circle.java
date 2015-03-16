package inheritance.with.override;

public class Circle extends Shape {
	
	// Shape로부터 물려받는 멤버
	/*
	double area;
	void makeArea() {}
	void display() {...}
	double getArea() {...}
	*/
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void makeArea() {	// 메소드 오버라이드
		area = Math.PI * Math.pow(radius, 2);	// Math.pow(a, b) => a의 b승
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
