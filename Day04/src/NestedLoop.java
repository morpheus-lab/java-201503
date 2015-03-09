
public class NestedLoop {
	public static void main(String[] args) {
		int i, j;
		
		L_DAN:
		for (i = 1; i < 10; i++, System.out.println()) {
			for (j = 1; j < 10; j++, System.out.print('\t')) {
				System.out.print(i + "*" + j + "=" + (i * j));
				
//				if (j == 6) break;
//				if (j == 6) continue L_DAN;	// 위 break와 같은 결과
				
				if (i == 5 && j == 7) break L_DAN;
			}
//			if (i == 5) break;
		}
		
	}
}
