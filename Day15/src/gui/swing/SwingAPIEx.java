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
		setTitle("Swing ���� �޼ҵ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ������ ���� ��ư ������ ��, ���α׷��� ���� ����
		
		contentPane = getContentPane();	// ������ ���ο� �ִ� �����̳� ��ü
		contentPane.setLayout(new FlowLayout());
		
		b1 = new JButton("��ġ�� ũ�� ����");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);
		
		b2 = new JButton("��� ����");
		b2.setOpaque(true);
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("���� ���", Font.ITALIC, 20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);
		
		b3 = new JButton("��Ȱ��ȭ ��ư");
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);
		
		b4 = new JButton("���̱�/�����");
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
			// ��ư�� Ŭ���Ǿ��� �� �� ��
			Object source = e.getSource();	// � ������Ʈ�� �̺�Ʈ�� �߻�?
			if (source == b1) {
				System.out.println("��ư�� ��ġ�� ũ��");
				System.out.println("��ġ: (" + b1.getX() + ", " + b1.getY() + ")");
				System.out.println("ũ��: (" + b1.getWidth() + ", " + b1.getHeight() + ")");
				
				System.out.println("����Ʈ ���� ��ġ�� ũ��");
				System.out.println("��ġ: (" + contentPane.getX() + ", " + contentPane.getY() + ")");
				System.out.println("ũ��: (" + contentPane.getWidth() + ", " + contentPane.getHeight() + ")");
			}
			else if (source == b2) {
				
			}
			else if (source == b3) {
				System.out.println("��Ȱ��ȭ ��ư�ε�? �̰� ������ �ȵǰ���...");
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



























