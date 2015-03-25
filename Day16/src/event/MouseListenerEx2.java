package event;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx2 extends JFrame {
	
	public MouseListenerEx2() {
		setTitle("���콺 ������ �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);	// ����Ʈ �� ��ü
		setLayout(null);	// ��ġ������ ���ֱ�
		
		JLabel label = new JLabel("hello");
		label.setSize(50, 20);	// ���̺� ũ�� ����
		label.setLocation(30, 30);	// ���̺� ��ġ ����
		contentPane.add(label);
		
		// ���콺 �����ʸ� ����Ʈ �ҿ� ���
		contentPane.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}
		});
		
		setSize(600, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListenerEx2();
	}
	
}
