package ex02_1_math;

public class MathRandomExam {
	
	public static void main(String[] args) {
		// 주사위 프로그램
		// 1 ~ 6 사이의 임의 정수를 발생
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 눈: " + dice);
	}
	
}
