package thread.terminate.flag;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreadFinishFlagEx extends JFrame {
	
	static JPanel newPane;
	
	public ThreadFinishFlagEx() {
		setTitle(""); // 윈도우 타이틀 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창닫기 버튼 처리
		
		// 윈도우 내 contentPane 교체
		newPane = new JPanel();
		newPane.setLayout(null);	// 내부 컴포넌트를 수동으로 배치시키기 위해
		setContentPane(newPane);
		
		RandomLabelThread t = new RandomLabelThread();
		t.start();
		
		newPane.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				t.finish();
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
	
}
