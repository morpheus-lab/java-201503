package world.test;

import world.asia.Korea;
//import world.asia.*;

public class KoreaUser {	// world.asia.Korea 클래스를 이용하는 클래스
	
	public static void main(String[] args) {
		
		Korea k = new Korea();
		
		k.i = 5;	// public 멤버 변수에 접근 OK
		k.capital = "한양";	// (package) 멤버 변수
							// => 다른 패키지에 속해 있는 KoreaUser로서는
							//    볼 수 없는 (숨겨져 있는) 멤버 변수
							// => 컴파일 에러 발생
		k.population = 1000;	// private 멤버 변수라서 Korea 클래스 외부에서는 그 누구도 접근 불가
								// 컴파일 에러 발생
	}
	
}
