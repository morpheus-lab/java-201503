package thread.timer;

public class TimerThread extends Thread {
	
	int flag = 0;
	
	public void terminate() {
		flag = 1;
	}
	
	public void run() {
		try {
			while (true) {
				if (flag != 0) {
					return;
				}
				// ���̺� ���� ����
//				ThreadTimerExam.count++;
				ThreadTimerExam.timerLabel.setText(++ThreadTimerExam.count + "");
				// 1�� �޽�
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			return;	// run() �޼ҵ� ����
		}
	}
	
}
