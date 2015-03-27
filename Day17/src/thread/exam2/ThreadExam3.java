package thread.exam2;

public class ThreadExam3 extends Thread {
	
	public void run() {
		try {
			for (int i = 1; i < 100; i += 2) {
				System.out.println(i);
				Thread.sleep(100);	// 0.1ÃÊ ÈÞ½Ä
			}
		} catch (InterruptedException e) {
			
		}
	}
	
}
