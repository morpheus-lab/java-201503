
public class Switch2 {
	
	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("90~100���Դϴ�.");
			break;
		case 'B':
			System.out.println("80~89���Դϴ�.");
			break;
		default:
			System.out.println("80�� �̸�");
		}
		
		/*
		int i = 0;
		
		// 5�� ���� �������� �󸶳Ŀ� ���� �ٸ� ó��
		
		if (i % 5 == 0) {
			
		} else if (i % 5 == 1) {
			
		} //...
		
		switch (i % 5) {
		case 0:
			System.out.println("5�� ����̱���!");
			break;
		case 1:
			break;
		case 2:
			break;
		}
		*/
	}
	
}
