
public class ReturnStmt {
	
	// ����Ÿ�� �޼ҵ��̸�([����Ÿ�� ���ڸ�]) {
	// ...
	// }
	static int sum(int a, int b) {
		return (a + b);
	}
	
	static int holzzak(int i) {
		// i�� Ȧ����� 1�� ����
		if (i % 2 == 1) {
			return 1;
		}
		// ¦����� 0�� ����
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int s = sum(1, 3);
		
		int i = 0, j = 10;
		s = sum(i, j);
		
		System.out.println("Ȧ¦: " + holzzak(7));
	}
	
}
