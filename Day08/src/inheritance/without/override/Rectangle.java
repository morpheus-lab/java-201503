package inheritance.without.override;

public class Rectangle extends Shape {
	
	// Shape로부터 물려받는 멤버
	/*
	double area;
	void display() {...}
	double getArea() {...}
	*/
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void makeAR()  {	// 사각형 면적 계산
		area = width * height;
	}

	// getters & setters
	// 메뉴바 Source > Generate Getters and Setters
	// 또는
	// <Alt>+<Shift>+S 누른 후, R
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
