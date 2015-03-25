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
		setTitle("키 리스너 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);	// 컨텐트 팬 교체
		setLayout(new FlowLayout());
		
		JLabel code = new JLabel("키 코드");
		JLabel character = new JLabel("유니코드 문자");
		JLabel text = new JLabel("키 텍스트");
		
		Font font = new Font("맑은 고딕", Font.PLAIN, 32);
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
				
				// 배경색 변경
				if (keyChar == '%') {
					contentPane.setBackground(Color.YELLOW);
				}
				else if (keyCode == KeyEvent.VK_F1) {	// "F1" 키
					contentPane.setBackground(Color.GREEN);
				}
			}
		});
		
		setSize(600, 400);
		setVisible(true);
		
		contentPane.requestFocus();	// 컨텐트 팬이 키보드 이벤트를 수신할 수 있도록..
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
	
}
