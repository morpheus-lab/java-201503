
public class MethodTest {
	
	// (멤버)메소드
	
	// 반환데이터타입 메소드이름(매개변수목록) {
	//     메소드가 실행할 코드
	//     //반환데이터가 있다면
	//     return 반환데이터;
	// }
	
	// 두 개 int 타입의 정수를 입력 받아서, 그 합을 되돌려주는 메소드
	int sum(int a, int b) {
		int s = a + b;
		return s;	// s 변수에 저장된 데이터를, 이 메소드를 호출한 곳으로 되돌려 줌
	}
	
}
