import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
	
	Container contentPane;
	int sum;	// 합계 금액
	
	JCheckBox apple;	// MyItemListener 내부에서 사용할 수 있도록 멤버로 선언
	JCheckBox pear;
	JCheckBox cherry;
	
	JLabel total;	// 합계 금액 출력용 레이블
	
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel price = new JLabel("사과: 500원, 배: 3000원, 체리: 20000원");
		contentPane.add(price);
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.png");
		
		apple = new JCheckBox("사과");
		pear = new JCheckBox("배");
		cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);	// 외곽선 그리도록
		cherry.setSelectedIcon(selectedCherryIcon);	// 선택 상태에서 표시할 이미지
		
		MyItemListener itemListener = new MyItemListener();
		apple.addItemListener(itemListener);
		pear.addItemListener(itemListener);
		cherry.addItemListener(itemListener);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		total = new JLabel("합계: 0원");
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
			
			// 합계 금액 계산
			if (isSelected) {	// 무엇인가 선택
				if (item == apple) {	// 무엇 == 사과 체크박스
					sum += 500;
				}
				else if (item == pear) {	// 무엇 == 배 체크박스
					sum += 3000;
				}
				else if (item == cherry) {	// 무엇 == 체리 체크박스
					sum += 20000;
				}
			} else {	// 무엇인가 선택해제
				if (item == apple) {	// 무엇 == 사과 체크박스
					sum -= 500;
				}
				else if (item == pear) {	// 무엇 == 배 체크박스
					sum -= 3000;
				}
				else if (item == cherry) {	// 무엇 == 체리 체크박스
					sum -= 20000;
				}
			}
			
			// 합계 금액 화면에 출력
			total.setText("합계: " + sum + "원");
		}
		
	}
	
}
