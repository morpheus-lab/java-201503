package system.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");	// 인자로 지정된 클래스 정보를 가진 Class 객체
		
		System.out.println(c.getName());
		
		// 필드 조회
		Field[] fields = c.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName());
		}
		
		System.out.println("멤버 메소드 ----------------");
		
		// 메소드 조회
		Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
	}
	
}























