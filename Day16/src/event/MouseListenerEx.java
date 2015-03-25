package event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseListenerEx extends JFrame {
	
	public MouseListenerEx() {
		setTitle("마우스 리스너 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// 버튼 만들고, 배치
		JButton btn = new JButton("마우스 이벤트 테스트 버튼");
		btn.setBackground(Color.YELLOW);
//		btn.addMouseListener(new MyMouseListener());
		
		// 마우스 리스너를 익명 객체로 생성 및 등록
		btn.addMouseListener(new MouseListener() {
			// MouseListener 인터페이스의 메소드 구현
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
		public void mouseClicked(MouseEvent e) {}	// 마우스가 클릭됐을 때
		public void mousePressed(MouseEvent e) {}	// 마우스 버튼이 눌러지는 순간
		public void mouseReleased(MouseEvent e) {}	// 마우스 버튼이 릴리즈되는 순간
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
