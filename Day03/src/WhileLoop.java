import java.util.Scanner;	// java.�̳� javax.���� �����ϴ� �ֵ��� Java���� �⺻���� �����ϴ� System API


public class WhileLoop {
	
	public static void main(String[] args) {
		
		// while���� �̿��ؼ� Ű����κ��� ���ڸ� �Է¹ް�, �Էµ� ������ ����� ���ϴ� ���α׷�
		// 0�� �ԷµǸ� �Է��� ����Ǵ� ���α׷�
		
		Scanner sc = new Scanner(System.in);	// Ű����κ��� �����͸� �Է¹��� �� �ִ� �༮
		
		int n;
		int sum = 0;
		int count = 0;
		
		while((n = sc.nextInt()) != 0) {
			count++;	// �ԷµǴ� ������ ������ ����
			sum += n;	// sum�� �Էµ� ���ڸ� ����
		}
		
		// ����ڰ� 0�� �Է��� ���
		
		System.out.println("�Է��� ������ ������ " + count + "���̰�, ����� " + ((double) sum / count));
		
	}
	
}
