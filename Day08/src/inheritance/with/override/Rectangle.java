package inheritance.with.override;

public class Rectangle extends Shape {
	
	// Shape로부터 물려받는 멤버
	/*
	double area;
	void makeArea() {}
	void display() {...}
	double getArea() {...}
	*/
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override	// 컴파일러에게 이 메소드가 상위 클래스의 동일 메소드를 재정의한 것임을 알리기 위해
	public void makeArea()  {
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
