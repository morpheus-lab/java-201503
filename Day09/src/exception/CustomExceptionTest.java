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
		System.out.print("2���� ū ������ �Է��ϼ���: ");
		try {
			test(Integer.parseInt(sc.nextLine()));
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ���� �������� �Է��ؾ��մϴ�.");
		} catch (ArgumentMustBeLargerThanTwoException e) {
			System.out.println("2���� ū ���� �Է��ϼž��մϴ�.");
		}
		sc.close();
	}
	
}
