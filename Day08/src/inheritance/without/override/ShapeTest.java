package inheritance.without.override;

public class ShapeTest {
	
	public void m(Shape s) {
		// s 객체의 구체 타입에 따라 면적을 계산
		if (s instanceof Circle) {
			Circle c = (Circle) s;	// Circle 타입으로 복원; 다운캐스팅
			c.makeAC();
		}
		else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;	// Rectangle 타입으로 복원; 다운캐스팅
			r.makeAR();
		}
		
		s.display();	// s 객체의 면적을 화면에 출력
	}
	
	public static void main(String[] args) {
		ShapeTest t = new ShapeTest();
//		t.m(new Shape());
//		t.m(new Circle(6));	// Circle객체가 Shape타입으로 업캐스팅 (자동)
		t.m(new Rectangle(4, 5));	// Rectangle객체가 Shape타입으로 업캐스팅 (자동)
	}
	
}
