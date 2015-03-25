package event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame {
	
	public KeyListenerEx() {
		setTitle("Ű ������ �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);	// ����Ʈ �� ��ü
		setLayout(new FlowLayout());
		
		JLabel code = new JLabel("Ű �ڵ�");
		JLabel character = new JLabel("�����ڵ� ����");
		JLabel text = new JLabel("Ű �ؽ�Ʈ");
		
		Font font = new Font("���� ���", Font.PLAIN, 32);
		code.setFont(font);
		character.setFont(font);
		text.setFont(font);
		
		code.setOpaque(true);
		code.setBackground(Color.WHITE);
		character.setOpaque(true);
		character.setBackground(Color.WHITE);
		text.setOpaque(true);
		text.setBackground(Color.WHITE);
		
		contentPane.add(code);
		contentPane.add(character);
		contentPane.add(text);
		
		contentPane.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				String keyText = KeyEvent.getKeyText(keyCode);
				
				code.setText(keyCode + "");
				character.setText(keyChar + "");
				text.setText(keyText);
				
				// ���� ����
				if (keyChar == '%') {
					contentPane.setBackground(Color.YELLOW);
				}
				else if (keyCode == KeyEvent.VK_F1) {	// "F1" Ű
					contentPane.setBackground(Color.GREEN);
				}
			}
		});
		
		setSize(600, 400);
		setVisible(true);
		
		contentPane.requestFocus();	// ����Ʈ ���� Ű���� �̺�Ʈ�� ������ �� �ֵ���..
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
	
}
