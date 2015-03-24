package gui.swing;

import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {
	Container contentPane;

	LabelEx() {
		setTitle(" 레이블 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon hearts = new ImageIcon("D:/images/hearts.png");
		JLabel imageLabel = new JLabel(hearts);
		
		ImageIcon normalIcon = new ImageIcon("D:/images/normalIcon.png");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon,
				SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}
}
