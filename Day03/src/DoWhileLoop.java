
public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		// do-while을 써서
		// 'a' - 'z'까지 출력
		
		char c = 'a';	// 영문자의 경우, 문자의 코드는 ASCII 코드를 따름
						// a~z (97~122), A-Z (65~90)
		
		do {
			System.out.print(c);
			c = (char)(c + 1);
		} while(c <= 'z');
		
	}
	
}
