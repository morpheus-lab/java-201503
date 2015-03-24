package gui.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class ButtonImageEx extends JFrame {
	Container contentPane;

	ButtonImageEx() {
		setTitle(" 버튼에 아이콘 달기 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
//		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.png");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.png");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.png");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
//		btn.setHorizontalAlignment(SwingConstants.LEFT);
//		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setHorizontalAlignment(SwingConstants.RIGHT);
//		btn.setVerticalAlignment(SwingConstants.TOP);
//		btn.setVerticalAlignment(SwingConstants.CENTER);
		btn.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(btn);
		
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();
	}
}