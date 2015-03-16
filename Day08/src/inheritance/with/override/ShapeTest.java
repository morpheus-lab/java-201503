package inheritance.with.override;

public class ShapeTest {
	
	public void m(Shape s) {
		s.makeArea();
		s.display();	// s 객체의 면적을 화면에 출력
	}
	
	public static void main(String[] args) {
		ShapeTest t = new ShapeTest();
//		t.m(new Shape());
//		t.m(new Circle(6));	// Circle객체가 Shape타입으로 업캐스팅 (자동)
		t.m(new Rectangle(4, 5));	// Rectangle객체가 Shape타입으로 업캐스팅 (자동)
	}
	
}
