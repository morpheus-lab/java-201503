import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
	
	Container contentPane;
	int sum;	// �հ� �ݾ�
	
	JCheckBox apple;	// MyItemListener ���ο��� ����� �� �ֵ��� ����� ����
	JCheckBox pear;
	JCheckBox cherry;
	
	JLabel total;	// �հ� �ݾ� ��¿� ���̺�
	
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel price = new JLabel("���: 500��, ��: 3000��, ü��: 20000��");
		contentPane.add(price);
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.png");
		
		apple = new JCheckBox("���");
		pear = new JCheckBox("��");
		cherry = new JCheckBox("ü��", cherryIcon);
		cherry.setBorderPainted(true);	// �ܰ��� �׸�����
		cherry.setSelectedIcon(selectedCherryIcon);	// ���� ���¿��� ǥ���� �̹���
		
		MyItemListener itemListener = new MyItemListener();
		apple.addItemListener(itemListener);
		pear.addItemListener(itemListener);
		cherry.addItemListener(itemListener);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		total = new JLabel("�հ�: 0��");
		contentPane.add(total);
		
		setSize(290, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
	
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			Object item = e.getItem();
			int state = e.getStateChange();
			boolean isSelected = (state == ItemEvent.SELECTED);
			
			// �հ� �ݾ� ���
			if (isSelected) {	// �����ΰ� ����
				if (item == apple) {	// ���� == ��� üũ�ڽ�
					sum += 500;
				}
				else if (item == pear) {	// ���� == �� üũ�ڽ�
					sum += 3000;
				}
				else if (item == cherry) {	// ���� == ü�� üũ�ڽ�
					sum += 20000;
				}
			} else {	// �����ΰ� ��������
				if (item == apple) {	// ���� == ��� üũ�ڽ�
					sum -= 500;
				}
				else if (item == pear) {	// ���� == �� üũ�ڽ�
					sum -= 3000;
				}
				else if (item == cherry) {	// ���� == ü�� üũ�ڽ�
					sum -= 20000;
				}
			}
			
			// �հ� �ݾ� ȭ�鿡 ���
			total.setText("�հ�: " + sum + "��");
		}
		
	}
	
}
