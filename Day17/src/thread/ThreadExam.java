package thread;

public class ThreadExam extends Thread {
	
	public void run() {
		try {
			for (int i = 10; i >= 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);	// 스레드를 잠재움 (인자로 지정된 시간(ms)동안)
			}
		} catch (InterruptedException e) {
			//
		}
	}
	
}
