package thread;

public class ThreadExamMain {
	
	public static void main(String[] args) {
		
		System.out.println("main ����");
		
		ThreadExam t = new ThreadExam();
		t.start(); // t��ü�� ������μ� ���� ����
		
		System.out.println("main ����");
		
	}
	
}
