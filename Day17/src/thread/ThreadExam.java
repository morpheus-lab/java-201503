package thread;

public class ThreadExam extends Thread {
	
	public void run() {
		try {
			for (int i = 10; i >= 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);	// �����带 ����� (���ڷ� ������ �ð�(ms)����)
			}
		} catch (InterruptedException e) {
			//
		}
	}
	
}
