
public class VariableTest {
	
	// �ν��Ͻ� ����, ��� ����, (�ν��Ͻ�)�ʵ� => ��ü ���� �� �ڵ� �ʱ�ȭ ��
	int a;
	byte b;
	char c;
	boolean b1;
	
	// ����ƽ ����, Ŭ���� ����, ����ƽ �ʵ�
	static int si;
	
	public static void main(String[] args) {
		
		// ���� ����
		int radius;	// radius��� �̸��� int �� ������ ��������� ����
		
//		System.out.println(radius);	// �������� radius�� �ڵ� �ʱ�ȭ ���� ����
		
		char c1, c2, c3;
//		char c1;
//		char c2;
//		char c3;
		
		// ���� ����� ���ÿ� ���� �ʱ�ȭ
		int radius2 = 10;
		char c4 = 'a', c5 = 'b', c6 = 'c';
		
		// �ڷ� �� ��ȯ
		byte b = 10;
		int i = b;	// ���� ������ Ÿ���� �����͸� ū ������ Ÿ�� ����ҿ� �����ϴ� ��
					// => �翬�� ����, ���������� ��ȯ
		
		int i2 = 30;
		//byte b1 = i2;	// �翬�� ���������� ����
		byte b1 = (byte) i2;	// i2�� ����� �����͸� ������ byte Ÿ������ �ٲٶ�
								// int 4����Ʈ �� ���� 3����Ʈ�� ������
		
//		float f1 = 32.5;	// �Ҽ��� �ִ� ���� ���ͷ��� double Ÿ������ ��޵�
		float f2 = 32.5f;
		float f3 = (float) 32.5;
		
		// int ���� ���� ������ ������
		byte b11, b12, b13;
		b11 = 10;
		b12 = 20;
//		b13 = b11 + b12;	// + �����ڰ� ����� int �� �����ͷ� �ֱ� ������ ����
		b13 = (byte)(b11 + b12);
		
	}
	
	public static void method1() {
//		radius = 10;	// main���� ������ ���� radius�� method1 �޼ҵ尡 �� �� ���� ����
						// main���� ������ ���� ������ main ���ο����� ��� ����
	}
	
}
