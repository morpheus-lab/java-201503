package system.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");	// ���ڷ� ������ Ŭ���� ������ ���� Class ��ü
		
		System.out.println(c.getName());
		
		// �ʵ� ��ȸ
		Field[] fields = c.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName());
		}
		
		System.out.println("��� �޼ҵ� ----------------");
		
		// �޼ҵ� ��ȸ
		Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
	}
	
}























