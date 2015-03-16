package inheritance.without.override;

public class ShapeTest {
	
	public void m(Shape s) {
		// s ��ü�� ��ü Ÿ�Կ� ���� ������ ���
		if (s instanceof Circle) {
			Circle c = (Circle) s;	// Circle Ÿ������ ����; �ٿ�ĳ����
			c.makeAC();
		}
		else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;	// Rectangle Ÿ������ ����; �ٿ�ĳ����
			r.makeAR();
		}
		
		s.display();	// s ��ü�� ������ ȭ�鿡 ���
	}
	
	public static void main(String[] args) {
		ShapeTest t = new ShapeTest();
//		t.m(new Shape());
//		t.m(new Circle(6));	// Circle��ü�� ShapeŸ������ ��ĳ���� (�ڵ�)
		t.m(new Rectangle(4, 5));	// Rectangle��ü�� ShapeŸ������ ��ĳ���� (�ڵ�)
	}
	
}
