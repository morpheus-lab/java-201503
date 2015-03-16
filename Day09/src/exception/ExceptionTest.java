package exception;

import java.util.Scanner;

public class ExceptionTest {
	
	public void m(int i) {
		int j = 99 / i;
		System.out.println("99를 " + i + "로 나눈 몫은 " + j + "입니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력
		
		System.out.println("99를 나눌 수를 입력하세요");
		
		String userInput = sc.nextLine();
		
		int i = Integer.parseInt(userInput);
		
		ExceptionTest t = new ExceptionTest();
		t.m(i);
		
		System.out.println("main 메소드 끝!");
		
		
	}
	
}
