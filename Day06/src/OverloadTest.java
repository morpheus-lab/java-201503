
public class OverloadTest {
	
	public static void main(String[] args) {
		
		f('c');	// 'c': char Ÿ�� ������
		f(1);	// 1 : int Ÿ�� ������
		f(20L);	// 20L: long Ÿ�� ������
		
		byte b = 3;
		f(b);	// b: byte Ÿ�� ������ -> int Ÿ������ ����ȯ -> f�޼ҵ� ȣ��
		
		short s = 5;
		f(s);	// s: short Ÿ�� ������ -> int Ÿ������ ����ȯ -> f�޼ҵ� ȣ��
		
//		f(2.0);	// 2.0: double Ÿ�� ������ -> ����ȯ�� �� �� �ִ� �Ű����� Ÿ���� ���� �޼ҵ尡 ����
	}
	
	static void f(char c) { System.out.println("f(char) ȣ���~"); }
	static void f(int i)  { System.out.println("f(int)  ȣ���~"); }
	static void f(long l) { System.out.println("f(long) ȣ���~"); }
	
	
	
}
