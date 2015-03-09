
public class ReturnStmt {
	
	// 리턴타입 메소드이름([인자타입 인자명]) {
	// ...
	// }
	static int sum(int a, int b) {
		return (a + b);
	}
	
	static int holzzak(int i) {
		// i가 홀수라면 1을 리턴
		if (i % 2 == 1) {
			return 1;
		}
		// 짝수라면 0을 리턴
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int s = sum(1, 3);
		
		int i = 0, j = 10;
		s = sum(i, j);
		
		System.out.println("홀짝: " + holzzak(7));
	}
	
}
