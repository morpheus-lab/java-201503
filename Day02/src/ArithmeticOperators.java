
public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		// +, -, *, / => ��Ģ����
		
		// %
		int a = 6;
		// a�� 3���� ������ �� ������??
		int b = a % 3;
		System.out.println(b);
		// �������� 0�̶��, a��? 3�� ���
		
		// Ȧ��? ¦��?
		int holJJak = a % 2;	// �������� 0�̶��, ¦��
								// �������� 1�̶��, Ȧ��
		
		// �� ������ �ð��� ������ ����
		int time = 3697;
		// x�ð� y�� z�� �� ��Ÿ���� �ڵ�
		// ��: 3697�� => 1�ð� 1�� 37��
		int x = time / 60 / 60;		// 60���� ������ �� ������ ��, �ٽ� 60���� ������ �ð� ������ �� => �ð�
		int y = (time / 60) % 60;	// 60���� ������ �� ������ ��, �̸� �ٽ� 60���� ���� ������ => ��
		int z = time % 60;			// 60���� ���� ������ => ��
		
		System.out.println(time + "�ʴ�, " + x + "�ð� " + y + "�� " + z + "���Դϴ�.");
		
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
	}
	
}


















