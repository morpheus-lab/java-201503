package exception;

import java.util.Scanner;

public class CustomExceptionTest {
	
	public static void test(int a) throws ArgumentMustBeLargerThanTwoException {
		if (a <= 2) {
			throw new ArgumentMustBeLargerThanTwoException();
		}
		System.out.println(Math.pow(a, 2));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2보다 큰 정수를 입력하세요: ");
		try {
			test(Integer.parseInt(sc.nextLine()));
		} catch (NumberFormatException e) {
			System.out.println("올바른 숫자 형식으로 입력해야합니다.");
		} catch (ArgumentMustBeLargerThanTwoException e) {
			System.out.println("2보다 큰 값을 입력하셔야합니다.");
		}
		sc.close();
	}
	
}
