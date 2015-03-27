package thread.terminate.flag;

import java.awt.Color;

import javax.swing.JLabel;

public class RandomLabelThread extends Thread {
	
	boolean flag = false;
	
	public void finish() {
		flag = true;
	}
	
	public void run() {
		while (true) {
			if (flag) {
				break;
			}
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			int x = (int) (Math.random() * ThreadFinishFlagEx.newPane.getWidth());
			int y = (int) (Math.random() * ThreadFinishFlagEx.newPane.getHeight());
			label.setLocation(x, y);
			ThreadFinishFlagEx.newPane.add(label);
			ThreadFinishFlagEx.newPane.repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}
		}
		// 모든 "Java" 레이블 삭제
		ThreadFinishFlagEx.newPane.removeAll();
		// 빨간색 "FINISH" 레이블 추가
		JLabel finishLabel = new JLabel("FINISH");
		finishLabel.setForeground(Color.RED);
		finishLabel.setSize(100, 30);
		finishLabel.setLocation(100, 100);
		ThreadFinishFlagEx.newPane.add(finishLabel);
		ThreadFinishFlagEx.newPane.repaint();
	}
	
}
