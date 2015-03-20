package ex01_format;

import java.text.MessageFormat;

public class MessageFormatExam {
	
	public static void main(String[] args) {
		
		String id = "java";
		String name = "ȫ�浿";
		String tel = "010-1234-1234";
		
		String pattern = "ȸ�� ID: {0}\nȸ�� �̸�: {1}\nȸ�� ��ȭ: {2}";
		String result = MessageFormat.format(pattern, id, name, tel);
		System.out.println(result);
		
		System.out.println("-----------------");
		
		String pattern2 = "INSERT INTO member VALUES({0},{1},{2})";
		Object[] arguments = {"'java'", "'ȫ�浿'", "'010-1234-1234'"};
		String result2 = MessageFormat.format(pattern2, arguments);
		System.out.println(result2);
	}
	
}
