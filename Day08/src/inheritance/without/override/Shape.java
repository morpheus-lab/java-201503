package inheritance.without.override;

public class Shape {
	
	protected double area;
	
	public void display() {
		System.out.println("면적은 " + this.area + "입니다.");
	}
	
	public double getArea() {	// 멤버 변수 area에 대한 Getter Method
		return area;
	}
	
}

