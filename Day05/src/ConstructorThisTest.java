class B {
	int i;
	public B() {
//		i = -1;
		this(-1);	// �ٸ� ������ ȣ��
		System.out.println("�⺻ ������ ȣ���");
	}
	public B(int a) {
//		this();	// �⺻ ������ ȣ��
		i = a;
		System.out.println("������2 ȣ���");
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






