package thread.exam2;

public class ThreadExamMain2 {
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		// ThreadExam2 객체 생성
		ThreadExam2 t2 = new ThreadExam2();	// 짝수 출력
		// ThreadExam3 객체 생성
		ThreadExam3 t3 = new ThreadExam3();	// 홀수 출력
		// 위 두 쓰레드 객체 시작 요청
		t2.start();
		t3.start();
		
		System.out.println("main 종료");
	}
	
}
