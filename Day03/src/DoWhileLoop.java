
public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		// do-while�� �Ἥ
		// 'a' - 'z'���� ���
		
		char c = 'a';	// �������� ���, ������ �ڵ�� ASCII �ڵ带 ����
						// a~z (97~122), A-Z (65~90)
		
		do {
			System.out.print(c);
			c = (char)(c + 1);
		} while(c <= 'z');
		
	}
	
}
