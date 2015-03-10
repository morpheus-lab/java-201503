
class Circle {
	double radius;
	
	void setRadius(double r) {
		radius = r;
	}
	
	double getArea() {
		return (Math.PI * radius * radius);	// Math.PI - Math Ŭ������ ���ǵ��ִ� double Ÿ���� ������ ��
	}
	
	void display() {
		System.out.println("Area of circle with radius " + radius + " = " + getArea());
	}
}

// �ϳ��� �ҽ����Ͽ� ���� Ŭ���� ���ǰ� ���� ����������,
// public Ŭ������ �ϳ��� �ҽ����Ͽ� �� �ϳ� ���� ����
// public Ŭ������ �����Ѵٸ�, �ҽ����� �̸��� public Ŭ������ �̸��� ��ġ�ؾ� ��
// �ϳ��� �ҽ����Ͽ� ���� Ŭ������ �ִ���, �����ϵǸ� ��� ������ .class ���Ϸ� ������
// main �޼ҵ带 ��������, public Ŭ�����̾�� ��
public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(), c2 = new Circle();
		
		c1.setRadius(2);	// ù ��° Circle ��ü���� setRadius �޽��� ����
		c2.setRadius(3);	// �� ��° Circle ��ü���� setRadius �޽��� ����
		
		c1.display();
		c2.display();
		
		double sumAreas = c1.getArea() + c2.getArea();
		System.out.println("�� ���� ���� ���� " + sumAreas);
		
	}
	
}


























