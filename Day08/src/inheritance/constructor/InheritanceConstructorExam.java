package inheritance.constructor;

class Super {
	int a;
	public Super() {
		// super();	// �θ� Ŭ������ ������ ȣ��
		System.out.println("Super �⺻ ������");
	}
	public Super(int i) {
		a = i;
		System.out.println("Super(int) ������");
	}
	public void m() {
		
	}
}

class Sub extends Super {
	long l;
	int[] arr;
	public Sub() {
//		super();
		// super(3);
		System.out.println("Sub �⺻ ������");
	}
}

public class InheritanceConstructorExam {
	public static void main(String[] args) {
		Sub sub = new Sub();
	}
}
