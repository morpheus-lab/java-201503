package event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseListenerEx extends JFrame {
	
	public MouseListenerEx() {
		setTitle("���콺 ������ �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// ��ư �����, ��ġ
		JButton btn = new JButton("���콺 �̺�Ʈ �׽�Ʈ ��ư");
		btn.setBackground(Color.YELLOW);
//		btn.addMouseListener(new MyMouseListener());
		
		// ���콺 �����ʸ� �͸� ��ü�� ���� �� ���
		btn.addMouseListener(new MouseListener() {
			// MouseListener �������̽��� �޼ҵ� ����
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
//				JButton b = (JButton) e.getSource();
//				b.setBackground(Color.RED);
				btn.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.YELLOW);
			}
		});
		
//		add(btn);
		getContentPane().add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
	
	class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {}	// ���콺�� Ŭ������ ��
		public void mousePressed(MouseEvent e) {}	// ���콺 ��ư�� �������� ����
		public void mouseReleased(MouseEvent e) {}	// ���콺 ��ư�� ������Ǵ� ����
		public void mouseEntered(MouseEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.YELLOW);
		}
	}
	
}
