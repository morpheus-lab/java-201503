package gui.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAPIEx extends JFrame {
	
	Container contentPane;
	JLabel label;
	JButton b1, b2, b3, b4;
	
	public SwingAPIEx() {
		setTitle("Swing 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우 종료 버튼 눌렀을 때, 프로그램이 완전 종료
		
		contentPane = getContentPane();	// 윈도우 내부에 있는 컨테이너 객체
		contentPane.setLayout(new FlowLayout());
		
		b1 = new JButton("위치와 크기 정보");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);
		
		b2 = new JButton("모양 정보");
		b2.setOpaque(true);
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);
		
		b3 = new JButton("비활성화 버튼");
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);
		
		b4 = new JButton("보이기/숨기기");
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingAPIEx();
	}
	
	class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 버튼이 클릭되었을 때 할 일
			Object source = e.getSource();	// 어떤 컴포넌트에 이벤트가 발생?
			if (source == b1) {
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치: (" + b1.getX() + ", " + b1.getY() + ")");
				System.out.println("크기: (" + b1.getWidth() + ", " + b1.getHeight() + ")");
				
				System.out.println("컨텐트 팬의 위치와 크기");
				System.out.println("위치: (" + contentPane.getX() + ", " + contentPane.getY() + ")");
				System.out.println("크기: (" + contentPane.getWidth() + ", " + contentPane.getHeight() + ")");
			}
			else if (source == b2) {
				
			}
			else if (source == b3) {
				System.out.println("비활성화 버튼인데? 이게 나오면 안되겠죠...");
			}
			else if (source == b4) {
				boolean isVisible = b1.isVisible();
				if (isVisible) {
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				} else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		}
		
	}
	
}



























