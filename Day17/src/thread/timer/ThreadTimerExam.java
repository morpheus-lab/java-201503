package thread.timer;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ThreadTimerExam extends JFrame {
	
	static int count;
	static JLabel timerLabel;
	
	public ThreadTimerExam() {
		setTitle("쓰레드 타이머 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		getContentPane().add(timerLabel);
		
		TimerThread t = new TimerThread();
		
		// 스레드 종료 버튼
		JButton stopBtn = new JButton("타이머 종료");
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 스레드 종료 시키기
//				t.interrupt();	// 타이머 스레드에 InterruptedException 발생
				t.terminate();	// 플래그 값 변경시켜서 run() 메소드 종료되도록
				// 버튼 비활성화
				stopBtn.setEnabled(false);
			}
		});
		getContentPane().add(stopBtn);
		
		setSize(300, 150);
		setVisible(true);
		
		t.start();	// 타이머 작동 시작
	}
	
	public static void main(String[] args) {
		new ThreadTimerExam();
	}
	
}
