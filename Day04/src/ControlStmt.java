import java.util.Scanner;


public class ControlStmt {
	public static void main(String[] args) {
		
//		for(int i = 1;; i++) {
//			System.out.println(i);
//			if (i == 10) {
//				break;
//			}
//		}
		
//		int i = 1;
//		while(true) {
//			System.out.println(i);
//			if (i == 10) break;
//		}
		
		/*
		// 사용자로 부터 숫자를 입력받아서 
		Scanner sc = new Scanner(System.in);	// 키보드로부터 데이터를 입력받을 수 있는 녀석
		
		int n;
		int sum = 0;
		int count = 0;
		
		while(true) {
			n = sc.nextInt();	// 사용자가 입력하는 숫자를 n에 저장
			if (n == 0) {	// n에 저장된 숫자가 0이라면
				break;		// while문을 벗어나기
			}
			count++;	// 입력되는 숫자의 개수를 집계
			sum += n;	// sum에 입력된 숫자를 누적
		}
		
		// 사용자가 0을 입력한 경우
		
		System.out.println("입력한 숫자의 개수는 " + count + "개이고, 평균은 " + ((double) sum / count));
		*/
		
		// 1부터 10까지의 정수 중 짝수의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// 홀수인 경우 건너 뛰기
			if (i % 2 == 1) {
				continue;
			}
			// 짝수인 경우에만 sum에 i값을 누적
			sum += i;
		}
		System.out.println("1~10 짝수 합: " + sum);
		
	}
}





















