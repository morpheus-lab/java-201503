import java.util.Scanner;


public class Omok {
	
	static final int WHITE = 1;
	static final int BLACK = 2;
	
	static int[][] badukPan = new int[10][10];
	
	static void printBoard() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (badukPan[x][y] == WHITE) {
					System.out.print("��");
				} else if (badukPan[x][y] == BLACK) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}
	
	static int isGameOver() {	// �浹�� �¸��� ��� BLACK�� ����
								// �鵹�� �¸��� ��� WHITE�� ����
								// ������ ���� ��� 0�� ����
		
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				int dol = badukPan[x][y];	// �浹�̶�� dol�� BLACK (2)
											// �鵹�̶�� dol�� WHITE (1)
				
				if (dol == 0) {
					continue;	// �浹/�鵹�� �������� �ʴٸ� ���� �ݺ����� �Ѿ
				}
				
				// ����������� 5�� ���� �����̶��
				if (x > 1 && x < badukPan.length - 2
						&& badukPan[x - 2][y] == dol
						&& badukPan[x - 1][y] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x + 1][y] == dol
						&& badukPan[x + 2][y] == dol) {
					// dol�� ����������� 5�� ���� �ϼ��� ���
//					System.out.println((dol == WHITE ? "��" : "��") + "���� �¸�!!! (����)");
					return dol;
				}
				// ������������ 5�� ���� �����̶��
				if (y > 1 && y < badukPan[x].length - 2
						&& badukPan[x][y - 2] == dol
						&& badukPan[x][y - 1] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x][y + 1] == dol
						&& badukPan[x][y + 2] == dol) {
					// dol�� ������������ 5�� ���� �ϼ��� ���
//					System.out.println((dol == WHITE ? "��" : "��") + "���� �¸�!!! (����)");
					return dol;
				}
				// ������ �Ʒ� �밢�� ����
				if (x > 1 && x < badukPan.length - 2
						&& y > 1 && y < badukPan[x].length - 2
						&& badukPan[x - 2][y - 2] == dol
						&& badukPan[x - 1][y - 1] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x + 1][y + 1] == dol
						&& badukPan[x + 2][y + 2] == dol) {
					// dol�� �����Ʒ� �밢�� ���� �ϼ�
//					System.out.println((dol == WHITE ? "��" : "��") + "���� �¸�!!! (�����Ʒ�)");
					return dol;
				}
				// ���� �Ʒ� �밢�� ����
				if (x > 1 && x < badukPan.length - 2
						&& y > 1 && y < badukPan[x].length - 2
						&& badukPan[x + 2][y - 2] == dol
						&& badukPan[x + 1][y - 1] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x - 1][y + 1] == dol
						&& badukPan[x - 2][y + 2] == dol) {
					// dol�� �޾Ʒ� �밢�� ���� �ϼ�
//					System.out.println((dol == WHITE ? "��" : "��") + "���� �¸�!!! (�޾Ʒ�)");
					return dol;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		boolean isBlackTurn = true;
		
		Scanner sc = new Scanner(System.in);
		// "x y" �� ���·� �Է�
		
		while(true) {
			printBoard();
			if (isBlackTurn) {
				System.out.print("�浹 ���� ��ǥ: ");
			}
			else {
				System.out.print("�鵹 ���� ��ǥ: ");
			}
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// x, y ��ǥ�� ���� ���� �ֳ�?
			if (badukPan[x][y] != 0) {
				// x,y�� ���� �̹� ���� �� ���
				System.out.println("���� �̹� ����. �ٽ�!");
			} else {
				// x, y ��ǥ�� ���� ���ٸ�
				badukPan[x][y] = isBlackTurn ? BLACK : WHITE;	// �ٵ��ǿ� �� ����
				
				// �¸� �˻�
				// ������ �̰�ٸ� while���� �������� ���α׷��� ����ǵ���
				int winner = isGameOver();
				
				if (winner != 0) {
					printBoard();	// �ٵ��� ����
					// ������ ����
					System.out.println((winner == WHITE ? "��" : "��") + "�� �¸�!!!");
					break;	// while �� ���� ����
				}
				
				isBlackTurn = !isBlackTurn;	// �� ��ȯ
			}
			
			System.out.println("-------------------------------------------");
		}
		
		System.out.println("������ �����մϴ�.");
		
		sc.close();	// ��ĳ�� ��ü ����
	}
	
}


















