package exception;

import java.util.Scanner;

public class ExceptionTest {
	
	public void m(int i) {
		int j = 99 / i;
		System.out.println("99�� " + i + "�� ���� ���� " + j + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// Ű���� �Է�
		
		System.out.println("99�� ���� ���� �Է��ϼ���");
		
		String userInput = sc.nextLine();
		
		int i = Integer.parseInt(userInput);
		
		ExceptionTest t = new ExceptionTest();
		t.m(i);
		
		System.out.println("main �޼ҵ� ��!");
		
		
	}
	
}
