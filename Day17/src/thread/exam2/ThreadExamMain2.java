package thread.exam2;

public class ThreadExamMain2 {
	
	public static void main(String[] args) {
		
		System.out.println("main ����");
		
		// ThreadExam2 ��ü ����
		ThreadExam2 t2 = new ThreadExam2();	// ¦�� ���
		// ThreadExam3 ��ü ����
		ThreadExam3 t3 = new ThreadExam3();	// Ȧ�� ���
		// �� �� ������ ��ü ���� ��û
		t2.start();
		t3.start();
		
		System.out.println("main ����");
	}
	
}
