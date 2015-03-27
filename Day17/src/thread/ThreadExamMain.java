package thread;

public class ThreadExamMain {
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		ThreadExam t = new ThreadExam();
		t.start(); // t객체가 스레드로서 할일 시작
		
		System.out.println("main 종료");
		
	}
	
}
