import java.util.Scanner;


public class ControlStmt {
	public static void main(String[] args) {
		
//		for(int i = 1;; i++) {
//			System.out.println(i);
//			if (i == 10) {
//				break;
//			}
//		}
		
//		int i = 1;
//		while(true) {
//			System.out.println(i);
//			if (i == 10) break;
//		}
		
		/*
		// ����ڷ� ���� ���ڸ� �Է¹޾Ƽ� 
		Scanner sc = new Scanner(System.in);	// Ű����κ��� �����͸� �Է¹��� �� �ִ� �༮
		
		int n;
		int sum = 0;
		int count = 0;
		
		while(true) {
			n = sc.nextInt();	// ����ڰ� �Է��ϴ� ���ڸ� n�� ����
			if (n == 0) {	// n�� ����� ���ڰ� 0�̶��
				break;		// while���� �����
			}
			count++;	// �ԷµǴ� ������ ������ ����
			sum += n;	// sum�� �Էµ� ���ڸ� ����
		}
		
		// ����ڰ� 0�� �Է��� ���
		
		System.out.println("�Է��� ������ ������ " + count + "���̰�, ����� " + ((double) sum / count));
		*/
		
		// 1���� 10������ ���� �� ¦���� ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// Ȧ���� ��� �ǳ� �ٱ�
			if (i % 2 == 1) {
				continue;
			}
			// ¦���� ��쿡�� sum�� i���� ����
			sum += i;
		}
		System.out.println("1~10 ¦�� ��: " + sum);
		
	}
}





















