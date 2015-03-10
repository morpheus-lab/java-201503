
class A {
	int i;	// 인스턴스 필드
	static int si;	// 클래스 필드 (스태틱 필드)
}

public class StaticTest {
	
	public static void main(String[] args) {
		// main 메소드가 실행되기 전 Class Loading 과정에서 A 클래스의 스태틱 필드 si는
		// 이미 메모리상에 공간이 할당 되고, 값이 0으로 초기화 됨
		
		A a1, a2;
		
		System.out.println(A.si);
//		System.out.println(A.i);	// 컴파일 에러 발생 => 클래스 이름으로 접근하기 위해서는 static이어야 함
		
		a1 = new A();
		a1.si++;
		a1.i++;
		
		a2 = new A();
		System.out.println(a2.si);
		System.out.println(a2.i);
		
		System.out.println(Math.PI);
		
	}
	
}
