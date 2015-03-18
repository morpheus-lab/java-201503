package system.api.object;

class B {
	int i;
	B() {}
	B(int i) {this.i = i;}
	
	@Override
	public String toString() {
		return String.valueOf(i);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof B)) {
			return false;
		}
		return (this.i == ((B) o).i);
	}
}

public class InheritanceTest {
	
	static void print(Object o) {	// ��� Ÿ���� ��ü�� ���ڷ� ���� �� ����
		System.out.println(o);
	}
	
	static void equalsTest(Object o1, Object o2) {
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));	// equals(): Object Ŭ������ ���ǵǾ� �ִ� �޼ҵ�
	}
	
	public static void main(String[] args) {
		B b1 = new B(10), b2 = new B(10);
		Object o1 = new Object(), o2 = new Object();
		print(b1);
		print(b2);
		print(o1);
		
		equalsTest(b1, b2);
		equalsTest(o1, o2);
		equalsTest(b1, o1);
		
		System.out.println("------------------------");
		
		o1 = b1;
		
		print(b1);
		print(b2);
		print(o1);
		
		equalsTest(b1, b2);
		equalsTest(o1, o2);
		equalsTest(b1, o1);
		
		System.out.println("------------------------");
		
		Integer i1 = new Integer(3);	// 3�̶�� int Ÿ���� ����
		Integer i2 = new Integer(3);	// 3�̶�� int Ÿ���� ����
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
	
}
