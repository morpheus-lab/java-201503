
public class OverloadTest {
	
	public static void main(String[] args) {
		
		f('c');	// 'c': char 타입 데이터
		f(1);	// 1 : int 타입 데이터
		f(20L);	// 20L: long 타입 데이터
		
		byte b = 3;
		f(b);	// b: byte 타입 데이터 -> int 타입으로 형변환 -> f메소드 호출
		
		short s = 5;
		f(s);	// s: short 타입 데이터 -> int 타입으로 형변환 -> f메소드 호출
		
//		f(2.0);	// 2.0: double 타입 데이터 -> 형변환이 될 수 있는 매개변수 타입을 가진 메소드가 없음
	}
	
	static void f(char c) { System.out.println("f(char) 호출됨~"); }
	static void f(int i)  { System.out.println("f(int)  호출됨~"); }
	static void f(long l) { System.out.println("f(long) 호출됨~"); }
	
	
	
}
