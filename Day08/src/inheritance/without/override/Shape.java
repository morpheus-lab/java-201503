package inheritance.without.override;

public class Shape {
	
	protected double area;
	
	public void display() {
		System.out.println("������ " + this.area + "�Դϴ�.");
	}
	
	public double getArea() {	// ��� ���� area�� ���� Getter Method
		return area;
	}
	
}

