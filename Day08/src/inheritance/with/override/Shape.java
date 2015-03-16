package inheritance.with.override;

public abstract class Shape {
	
	protected double area;
	
	abstract public void makeArea();
	
	public void display() {
		System.out.println("면적은 " + this.area + "입니다.");
	}
	
	public double getArea() {	// 멤버 변수 area에 대한 Getter Method
		return area;
	}
	
}

