
class Circle {
	double radius;	// 멤버 변수 radius
	
	Circle setRadius(double radius) {	// 멤버변수 radius에 매개변수 radius의 값을 저장하는 메소드
		this.radius = radius;
		return this;	// 객체 자기 자신의 참조값을 되돌려 줌
	}
	
	double getArea() {	// 면적을 계산해서 되돌려 주는 메소드
		return Math.PI * radius * radius;
	}
	
	Circle display() {	// 반지름, 면적을 화면에 출력하는 메소드
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + getArea());
		return this;	// 자신의 참조값 리턴
	}
}

public class ThisKeyword {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
//		c1.setRadius(3.0);	// 반지름 설정
//		c1.display();	// 정보 출력
		
//		c1.setRadius(3.0).display();
		
		c1.setRadius(3.0).display().setRadius(2.0).display().setRadius(4.5).display();
	}
	
}
