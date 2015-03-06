
public class IfStatement {
	
	public static void main(String[] args) {
		f(6);
	}
	
	static void f(int i) {
		// 짝수
		if (i % 2 == 0)	// 2로 나눈 나머지가 0이면
			System.out.println("짝수");
		
		// 3의 배수
		if (i % 3 == 0) {	// 3으로 나눈 나머지가 0이면
			System.out.println("3의 배수");
			System.out.println("i = " + i);
		}
		
		// 5로 나눈 나머지가 얼마냐에 따라 다른 처리
		if (i % 5 == 0) {
			System.out.println("5의 배수");
		} else if (i % 5 == 1) {
			System.out.println("5의 배수 + 1");
		} else {
			System.out.println("5의 배수 + 2 또는 3 또는 4");
		}
	}
	
}
