package gui.swing;

import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {
	Container contentPane;

	LabelEx() {
		setTitle(" ���̺� ���� ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�.");
		
		ImageIcon hearts = new ImageIcon("D:/images/hearts.png");
		JLabel imageLabel = new JLabel(hearts);
		
		ImageIcon normalIcon = new ImageIcon("D:/images/normalIcon.png");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon,
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
