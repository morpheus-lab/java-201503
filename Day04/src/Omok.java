import java.util.Scanner;


public class Omok {
	
	static final int WHITE = 1;
	static final int BLACK = 2;
	
	static int[][] badukPan = new int[10][10];
	
	static void printBoard() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (badukPan[x][y] == WHITE) {
					System.out.print("○");
				} else if (badukPan[x][y] == BLACK) {
					System.out.print("●");
				} else {
					System.out.print("┼");
				}
			}
			System.out.println();
		}
	}
	
	static int isGameOver() {	// 흑돌이 승리한 경우 BLACK을 리턴
								// 백돌이 승리한 경우 WHITE를 리턴
								// 끝나지 않은 경우 0을 리턴
		
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				int dol = badukPan[x][y];	// 흑돌이라면 dol이 BLACK (2)
											// 백돌이라면 dol이 WHITE (1)
				
				if (dol == 0) {
					continue;	// 흑돌/백돌이 놓여있지 않다면 다음 반복으로 넘어감
				}
				
				// 수평방향으로 5개 돌이 연속이라면
				if (x > 1 && x < badukPan.length - 2
						&& badukPan[x - 2][y] == dol
						&& badukPan[x - 1][y] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x + 1][y] == dol
						&& badukPan[x + 2][y] == dol) {
					// dol이 수평방향으로 5개 돌을 완성한 경우
//					System.out.println((dol == WHITE ? "백" : "흑") + "돌이 승리!!! (수평)");
					return dol;
				}
				// 수직방향으로 5개 돌이 연속이라면
				if (y > 1 && y < badukPan[x].length - 2
						&& badukPan[x][y - 2] == dol
						&& badukPan[x][y - 1] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x][y + 1] == dol
						&& badukPan[x][y + 2] == dol) {
					// dol이 수직방향으로 5개 돌을 완성한 경우
//					System.out.println((dol == WHITE ? "백" : "흑") + "돌이 승리!!! (수직)");
					return dol;
				}
				// 오른쪽 아래 대각선 방향
				if (x > 1 && x < badukPan.length - 2
						&& y > 1 && y < badukPan[x].length - 2
						&& badukPan[x - 2][y - 2] == dol
						&& badukPan[x - 1][y - 1] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x + 1][y + 1] == dol
						&& badukPan[x + 2][y + 2] == dol) {
					// dol이 오른아래 대각선 방향 완성
//					System.out.println((dol == WHITE ? "백" : "흑") + "돌이 승리!!! (오른아래)");
					return dol;
				}
				// 왼쪽 아래 대각선 방향
				if (x > 1 && x < badukPan.length - 2
						&& y > 1 && y < badukPan[x].length - 2
						&& badukPan[x + 2][y - 2] == dol
						&& badukPan[x + 1][y - 1] == dol
						&& badukPan[x][y] == dol
						&& badukPan[x - 1][y + 1] == dol
						&& badukPan[x - 2][y + 2] == dol) {
					// dol이 왼아래 대각선 방향 완성
//					System.out.println((dol == WHITE ? "백" : "흑") + "돌이 승리!!! (왼아래)");
					return dol;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		boolean isBlackTurn = true;
		
		Scanner sc = new Scanner(System.in);
		// "x y" 의 형태로 입력
		
		while(true) {
			printBoard();
			if (isBlackTurn) {
				System.out.print("흑돌 놓을 좌표: ");
			}
			else {
				System.out.print("백돌 놓을 좌표: ");
			}
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// x, y 좌표에 돌이 놓여 있나?
			if (badukPan[x][y] != 0) {
				// x,y에 돌이 이미 놓여 진 경우
				System.out.println("돌이 이미 있음. 다시!");
			} else {
				// x, y 좌표에 돌이 없다면
				badukPan[x][y] = isBlackTurn ? BLACK : WHITE;	// 바둑판에 돌 놓기
				
				// 승리 검사
				// 누군가 이겼다면 while문을 빠져나가 프로그램이 종료되도록
				int winner = isGameOver();
				
				if (winner != 0) {
					printBoard();	// 바둑판 갱신
					// 게임이 종료
					System.out.println((winner == WHITE ? "백" : "흑") + "돌 승리!!!");
					break;	// while 문 빠져 나감
				}
				
				isBlackTurn = !isBlackTurn;	// 턴 전환
			}
			
			System.out.println("-------------------------------------------");
		}
		
		System.out.println("게임을 종료합니다.");
		
		sc.close();	// 스캐너 객체 정리
	}
	
}


















