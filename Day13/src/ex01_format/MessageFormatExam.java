package ex01_format;

import java.text.MessageFormat;

public class MessageFormatExam {
	
	public static void main(String[] args) {
		
		String id = "java";
		String name = "홍길동";
		String tel = "010-1234-1234";
		
		String pattern = "회원 ID: {0}\n회원 이름: {1}\n회원 전화: {2}";
		String result = MessageFormat.format(pattern, id, name, tel);
		System.out.println(result);
		
		System.out.println("-----------------");
		
		String pattern2 = "INSERT INTO member VALUES({0},{1},{2})";
		Object[] arguments = {"'java'", "'홍길동'", "'010-1234-1234'"};
		String result2 = MessageFormat.format(pattern2, arguments);
		System.out.println(result2);
	}
	
}
