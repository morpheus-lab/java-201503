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
				// 레이블 숫자 변경
//				ThreadTimerExam.count++;
				ThreadTimerExam.timerLabel.setText(++ThreadTimerExam.count + "");
				// 1초 휴식
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			return;	// run() 메소드 종료
		}
	}
	
}
