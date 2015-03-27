package thread.terminate.flag;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreadFinishFlagEx extends JFrame {
	
	static JPanel newPane;
	
	public ThreadFinishFlagEx() {
		setTitle(""); // ������ Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// â�ݱ� ��ư ó��
		
		// ������ �� contentPane ��ü
		newPane = new JPanel();
		newPane.setLayout(null);	// ���� ������Ʈ�� �������� ��ġ��Ű�� ����
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
