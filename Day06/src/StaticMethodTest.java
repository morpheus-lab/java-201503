
public class StaticMethodTest {
	
	int sum(int a, int b) {
		return a + b;
	}
	
	double avg(int a, int b) {
		return (((double) a) / b);
	}
	
	static int power(int a, int b) {	// a의 b승을 계산해서 리턴
		if (b >= 0) {
			int result = 1;
			for (int i = 0; i < b; i++) {	// b회 반복
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
		
		// 인스턴스 메소드(static 없는 것)는 오직 인스턴스(객체)를 통해서만 실행 될 수 있다!
		
		StaticMethodTest t = new StaticMethodTest();
		System.out.println(t.sum(1, 4));
		System.out.println(t.avg(3, 8));
	}
	
}
