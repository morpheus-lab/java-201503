import java.util.Scanner;	// java.이나 javax.으로 시작하는 애들은 Java에서 기본으로 제공하는 System API


public class WhileLoop {
	
	public static void main(String[] args) {
		
		// while문을 이용해서 키보드로부터 숫자를 입력받고, 입력된 숫자의 평균을 구하는 프로그램
		// 0이 입력되면 입력이 종료되는 프로그램
		
		Scanner sc = new Scanner(System.in);	// 키보드로부터 데이터를 입력받을 수 있는 녀석
		
		int n;
		int sum = 0;
		int count = 0;
		
		while((n = sc.nextInt()) != 0) {
			count++;	// 입력되는 숫자의 개수를 집계
			sum += n;	// sum에 입력된 숫자를 누적
		}
		
		// 사용자가 0을 입력한 경우
		
		System.out.println("입력한 숫자의 개수는 " + count + "개이고, 평균은 " + ((double) sum / count));
		
	}
	
}
