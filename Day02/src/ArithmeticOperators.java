
public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		// +, -, *, / => 사칙연산
		
		// %
		int a = 6;
		// a를 3으로 나눴을 때 나머지??
		int b = a % 3;
		System.out.println(b);
		// 나머지가 0이라면, a는? 3의 배수
		
		// 홀수? 짝수?
		int holJJak = a % 2;	// 나머지가 0이라면, 짝수
								// 나머지가 1이라면, 홀수
		
		// 초 단위의 시간을 정수로 지정
		int time = 3697;
		// x시간 y분 z초 로 나타내는 코드
		// 예: 3697초 => 1시간 1분 37초
		int x = time / 60 / 60;		// 60으로 나누면 분 단위의 값, 다시 60으로 나누면 시간 단위의 값 => 시간
		int y = (time / 60) % 60;	// 60으로 나누면 분 단위의 값, 이를 다시 60으로 나눈 나머지 => 분
		int z = time % 60;			// 60으로 나눈 나머지 => 초
		
		System.out.println(time + "초는, " + x + "시간 " + y + "분 " + z + "초입니다.");
		
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
	}
	
}


















