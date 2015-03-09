
public class MultiArrayTest {
	
	// »ó¼ö
	static final int WHITE = 1;
	static final int BLACK = 2;
	
	public static void main(String[] args) {
		
		int[][] badukPan = new int[10][10];
		
		badukPan[2][1] = WHITE;
		badukPan[1][2] = BLACK;
		
		
		
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (badukPan[x][y] == WHITE) {
					System.out.print("¡Û");
				} else if (badukPan[x][y] == BLACK) {
					System.out.print("¡Ü");
				} else {
					System.out.print("¦«");
				}
			}
			System.out.println();
		}
		
	}
	
}
