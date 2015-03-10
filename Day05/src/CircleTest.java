
class Circle {
	double radius;
	
	void setRadius(double r) {
		radius = r;
	}
	
	double getArea() {
		return (Math.PI * radius * radius);	// Math.PI - Math 클래스에 정의돼있는 double 타입의 원주율 값
	}
	
	void display() {
		System.out.println("Area of circle with radius " + radius + " = " + getArea());
	}
}

// 하나의 소스파일에 여러 클래스 정의가 존재 가능하지만,
// public 클래스는 하나의 소스파일에 단 하나 존재 가능
// public 클래스가 존재한다면, 소스파일 이름과 public 클래스의 이름이 일치해야 함
// 하나의 소스파일에 여러 클래스가 있더라도, 컴파일되면 모두 별도의 .class 파일로 생성됨
// main 메소드를 가지려면, public 클래스이어야 함
public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(), c2 = new Circle();
		
		c1.setRadius(2);	// 첫 번째 Circle 객체에게 setRadius 메시지 보냄
		c2.setRadius(3);	// 두 번째 Circle 객체에게 setRadius 메시지 보냄
		
		c1.display();
		c2.display();
		
		double sumAreas = c1.getArea() + c2.getArea();
		System.out.println("두 원의 넓이 합은 " + sumAreas);
		
	}
	
}


























