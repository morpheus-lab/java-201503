package system.api;

import java.util.Scanner;

public class RuntimeInstantiationTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("객체화하고자하는 클래스의 full name을 입력: ");
		
		String className = sc.nextLine();
		
		Class c = Class.forName(className);
		
		Object obj = c.newInstance();
		
		System.out.println(obj);
	}
	
}
