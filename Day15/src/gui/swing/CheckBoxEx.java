package gui.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	
	Container contentPane;
	
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.png");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		cherry.setBorderPainted(true);	// �ܰ��� �׸�����
		cherry.setSelectedIcon(selectedCherryIcon);	// ���� ���¿��� ǥ���� �̹���
		
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
