package inheritance.constructor;

class Super {
	int a;
	public Super() {
		// super();	// 부모 클래스의 생성자 호출
		System.out.println("Super 기본 생성자");
	}
	public Super(int i) {
		a = i;
		System.out.println("Super(int) 생성자");
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
		System.out.println("Sub 기본 생성자");
	}
}

public class InheritanceConstructorExam {
	public static void main(String[] args) {
		Sub sub = new Sub();
	}
}
