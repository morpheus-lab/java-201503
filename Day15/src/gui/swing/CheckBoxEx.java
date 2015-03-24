package gui.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	
	Container contentPane;
	
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.png");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);	// 외곽선 그리도록
		cherry.setSelectedIcon(selectedCherryIcon);	// 선택 상태에서 표시할 이미지
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(350, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
	
}
