
public class StaticMethodTest {
	
	int sum(int a, int b) {
		return a + b;
	}
	
	double avg(int a, int b) {
		return (((double) a) / b);
	}
	
	static int power(int a, int b) {	// a�� b���� ����ؼ� ����
		if (b >= 0) {
			int result = 1;
			for (int i = 0; i < b; i++) {	// bȸ �ݺ�
				result *= a;
			}
			return result;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2, 3));
		System.out.println(StaticMethodTest.power(4, 3));
		
//		sum(1, 2);
//		avg(2, 3);
		
		// �ν��Ͻ� �޼ҵ�(static ���� ��)�� ���� �ν��Ͻ�(��ü)�� ���ؼ��� ���� �� �� �ִ�!
		
		StaticMethodTest t = new StaticMethodTest();
		System.out.println(t.sum(1, 4));
		System.out.println(t.avg(3, 8));
	}
	
}
