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
		setTitle("������ Ÿ�̸� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		getContentPane().add(timerLabel);
		
		TimerThread t = new TimerThread();
		
		// ������ ���� ��ư
		JButton stopBtn = new JButton("Ÿ�̸� ����");
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������ ���� ��Ű��
//				t.interrupt();	// Ÿ�̸� �����忡 InterruptedException �߻�
				t.terminate();	// �÷��� �� ������Ѽ� run() �޼ҵ� ����ǵ���
				// ��ư ��Ȱ��ȭ
				stopBtn.setEnabled(false);
			}
		});
		getContentPane().add(stopBtn);
		
		setSize(300, 150);
		setVisible(true);
		
		t.start();	// Ÿ�̸� �۵� ����
	}
	
	public static void main(String[] args) {
		new ThreadTimerExam();
	}
	
}
