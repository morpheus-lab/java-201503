
public class LiteralExam {
	
	public static void main(String[] args) {
		// 정수 리터럴
		// 10진수 정수 리터럴
		int d1 = 15;
		int d2 = 20;
		// 8진수 정수 리터럴: 0 으로 시작
		int o1 = 015;	// 8진수 15 => 1 * 8 + 5 = 13
		System.out.println(o1);
		// 16진수 정수 리터럴: 0x 로 시작
		int h1 = 0x33;	// 16진수 33 => 3 * 16 + 3 = 51
		System.out.println(h1);
		// 2진수 정수 리터럴: 0b 로 시작
		int b1 = 0b0101;	// 2진수 0101 => 1 * 2^2 + 1 = 5
		System.out.println(b1);
		
		// 모든 정수 리터럴은 int 형으로 취급됨
		
		// long 타입 리터럴은 숫자 뒤에 L 또는 l을 붙여 표시
		long l1 = 458282l;	// l을 붙여야 long으로 취급됨
		
		//------------------------------
		// 실수 타입 리터럴 => double 타입으로 취급됨
		double d11 = 12.;	// 12.0을 나타냄
		double d12 = 12.0;
		double d13 = .1234;		// 0.1234
		double d14 = 0.1234;
		double d15 = 1234E-4;	// 1234 * 10 ^ -4
		
		float f1 = 3.14f;	// float 리터럴임을 명시적으로 표시
		
		double d16 = 3.141592d;	// d는 안붙여도 되지만, 명시적으로 표시하고자 하면 붙여도 무방
		
		//--------------------------------
		// 문자 타입 리터럴 => 작은 따옴표로 문자를 묶어서 표현
		// 'a', 'W', '가', '*'
		char c1 = 'a';
		char c2 = 'W';
		char c3 = '가';
		char c4 = '*';
		// 16진수로 표현한 2바이트의 유니코드(Unicode)
		char c5 = '\u0041';	// 0x41번의 코드에 해당하는 문자를 의미함
		System.out.println(c5);
		char c6 = '\uae00';	// 0xae00 => 10 * 16^3 + 14 * 16^2
		System.out.println(c6);	// 16진수 AE00이라는 코드를 가진 문자
		// 특수기호문자
		// '\t' => 탭 (tab)
		// '\r' => 캐리지 리턴 (carriage return)
		// '\n' => 라인 피드 (line feed)
		// '\f' => 폼 피드 (form feed)
		// '\'' => ' (작은 따옴표 문자 그 자체를 의미)
		// '\"' => " (큰 따옴표 문자 그 자체를 의미)
		// '\\' => \ (역 슬래시 문자 그 자체를 의미)
		
		// -------------------------------
		// 논리 타입 리터럴
		// true, false 두 가지 뿐
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = (10 > 0);	// true 또는 false로 그 결과가 나오는 논리 연산식으로도 값 지정 가능
		System.out.println(bool3);
		
		// -------------------------------
		// 문자열 타입 리터럴 => "abcd" (여러개의 문자를 큰 따옴표로 감싸서 표시
		String str1 = "Good";
		String str2 = "자바";
		
		//----------------------------
		// null 리터럴 => 참조형 변수에만 지정할 수 있는 리터럴, "참조값이 없음"을 의미함
		String str3 = null;
//		int a111 = null;	// 기본 데이터 타입에는 null 리터럴 쓸 수 없음
		
	}
	
}





















