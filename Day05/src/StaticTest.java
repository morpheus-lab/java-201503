
class A {
	int i;	// �ν��Ͻ� �ʵ�
	static int si;	// Ŭ���� �ʵ� (����ƽ �ʵ�)
}

public class StaticTest {
	
	public static void main(String[] args) {
		// main �޼ҵ尡 ����Ǳ� �� Class Loading �������� A Ŭ������ ����ƽ �ʵ� si��
		// �̹� �޸𸮻� ������ �Ҵ� �ǰ�, ���� 0���� �ʱ�ȭ ��
		
		A a1, a2;
		
		System.out.println(A.si);
//		System.out.println(A.i);	// ������ ���� �߻� => Ŭ���� �̸����� �����ϱ� ���ؼ��� static�̾�� ��
		
		a1 = new A();
		a1.si++;
		a1.i++;
		
		a2 = new A();
		System.out.println(a2.si);
		System.out.println(a2.i);
		
		System.out.println(Math.PI);
		
	}
	
}
