
public class TernaryOperator {	// 삼항연산자
	
	public static void main(String[] args) {
		
		// 두 수의 차를 구하는 프로그램
		
		int a = 3, b = 5;
		
		// a > b ==> a - b
		
		// a < b ==> b - a
		
		System.out.println("두 수의 차는 " + ((a > b) ? (a - b) : (b - a)));
		
	}

}
