
public class IfStatement {
	
	public static void main(String[] args) {
		f(6);
	}
	
	static void f(int i) {
		// ¦��
		if (i % 2 == 0)	// 2�� ���� �������� 0�̸�
			System.out.println("¦��");
		
		// 3�� ���
		if (i % 3 == 0) {	// 3���� ���� �������� 0�̸�
			System.out.println("3�� ���");
			System.out.println("i = " + i);
		}
		
		// 5�� ���� �������� �󸶳Ŀ� ���� �ٸ� ó��
		if (i % 5 == 0) {
			System.out.println("5�� ���");
		} else if (i % 5 == 1) {
			System.out.println("5�� ��� + 1");
		} else {
			System.out.println("5�� ��� + 2 �Ǵ� 3 �Ǵ� 4");
		}
	}
	
}
