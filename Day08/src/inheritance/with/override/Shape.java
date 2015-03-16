package inheritance.with.override;

public abstract class Shape {
	
	protected double area;
	
	abstract public void makeArea();
	
	public void display() {
		System.out.println("������ " + this.area + "�Դϴ�.");
	}
	
	public double getArea() {	// ��� ���� area�� ���� Getter Method
		return area;
	}
	
}

