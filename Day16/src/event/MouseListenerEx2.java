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
		setTitle("마우스 리스너 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);	// 컨텐트 팬 교체
		setLayout(null);	// 배치관리자 없애기
		
		JLabel label = new JLabel("hello");
		label.setSize(50, 20);	// 레이블 크기 설정
		label.setLocation(30, 30);	// 레이블 위치 설정
		contentPane.add(label);
		
		// 마우스 리스너를 컨텐트 팬에 등록
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
