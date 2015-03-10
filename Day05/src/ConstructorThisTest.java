class B {
	int i;
	public B() {
//		i = -1;
		this(-1);	// 다른 생성자 호출
		System.out.println("기본 생성자 호출됨");
	}
	public B(int a) {
//		this();	// 기본 생성자 호출
		i = a;
		System.out.println("생성자2 호출됨");
	}
}
public class ConstructorThisTest {
	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.i);
		
//		B b2 = new B(3);
//		System.out.println(b2.i);
		
	}
}






