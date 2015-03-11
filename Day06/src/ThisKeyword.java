
class Circle {
	double radius;	// ��� ���� radius
	
	Circle setRadius(double radius) {	// ������� radius�� �Ű����� radius�� ���� �����ϴ� �޼ҵ�
		this.radius = radius;
		return this;	// ��ü �ڱ� �ڽ��� �������� �ǵ��� ��
	}
	
	double getArea() {	// ������ ����ؼ� �ǵ��� �ִ� �޼ҵ�
		return Math.PI * radius * radius;
	}
	
	Circle display() {	// ������, ������ ȭ�鿡 ����ϴ� �޼ҵ�
		System.out.println("�������� " + radius + "�� ���� ���̴� " + getArea());
		return this;	// �ڽ��� ������ ����
	}
}

public class ThisKeyword {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
//		c1.setRadius(3.0);	// ������ ����
//		c1.display();	// ���� ���
		
//		c1.setRadius(3.0).display();
		
		c1.setRadius(3.0).display().setRadius(2.0).display().setRadius(4.5).display();
	}
	
}
