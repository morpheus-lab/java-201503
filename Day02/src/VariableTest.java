
public class VariableTest {
	
	// 인스턴스 변수, 멤버 변수, (인스턴스)필드 => 객체 생성 후 자동 초기화 됨
	int a;
	byte b;
	char c;
	boolean b1;
	
	// 스태틱 변수, 클래스 변수, 스태틱 필드
	static int si;
	
	public static void main(String[] args) {
		
		// 변수 선언
		int radius;	// radius라는 이름의 int 형 데이터 저장공간을 만듦
		
//		System.out.println(radius);	// 지역변수 radius는 자동 초기화 되지 않음
		
		char c1, c2, c3;
//		char c1;
//		char c2;
//		char c3;
		
		// 변수 선언과 동시에 값을 초기화
		int radius2 = 10;
		char c4 = 'a', c5 = 'b', c6 = 'c';
		
		// 자료 형 변환
		byte b = 10;
		int i = b;	// 작은 데이터 타입의 데이터를 큰 데이터 타입 저장소에 저장하는 일
					// => 당연히 가능, 묵시적으로 변환
		
		int i2 = 30;
		//byte b1 = i2;	// 당연히 가능하지는 않음
		byte b1 = (byte) i2;	// i2에 저장된 데이터를 강제로 byte 타입으로 바꾸라
								// int 4바이트 중 앞의 3바이트를 버려라
		
//		float f1 = 32.5;	// 소수점 있는 숫자 리터럴은 double 타입으로 취급됨
		float f2 = 32.5f;
		float f3 = (float) 32.5;
		
		// int 보다 작은 정수형 데이터
		byte b11, b12, b13;
		b11 = 10;
		b12 = 20;
//		b13 = b11 + b12;	// + 연산자가 결과를 int 형 데이터로 주기 때문에 에러
		b13 = (byte)(b11 + b12);
		
	}
	
	public static void method1() {
//		radius = 10;	// main에서 선언한 변수 radius는 method1 메소드가 알 수 없는 변수
						// main에서 선언한 지역 변수는 main 내부에서만 사용 가능
	}
	
}
