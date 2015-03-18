package system.api;

import java.util.Scanner;

public class RuntimeInstantiationTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��üȭ�ϰ����ϴ� Ŭ������ full name�� �Է�: ");
		
		String className = sc.nextLine();
		
		Class c = Class.forName(className);
		
		Object obj = c.newInstance();
		
		System.out.println(obj);
	}
	
}
