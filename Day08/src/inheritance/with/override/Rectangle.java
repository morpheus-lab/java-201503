package inheritance.with.override;

public class Rectangle extends Shape {
	
	// Shape�κ��� �����޴� ���
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
	
	@Override	// �����Ϸ����� �� �޼ҵ尡 ���� Ŭ������ ���� �޼ҵ带 �������� ������ �˸��� ����
	public void makeArea()  {
		area = width * height;
	}

	// getters & setters
	// �޴��� Source > Generate Getters and Setters
	// �Ǵ�
	// <Alt>+<Shift>+S ���� ��, R
	
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
