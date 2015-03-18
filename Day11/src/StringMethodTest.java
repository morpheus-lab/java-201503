import java.io.UnsupportedEncodingException;


public class StringMethodTest {
	
	public static void main(String[] args) {
		/*
		String s = "자바";
		byte[] bytes = s.getBytes();	// 시스템 기본 문자 인코딩 방법에 따른
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		
		String str = new String(bytes);
		System.out.println("디코딩 문자: " + str);
		
		// utf-8
		try {
			bytes = s.getBytes("UTF-8");
			for (int i = 0; i < bytes.length; i++) {
				System.out.printf("%x", bytes[i]);
			}
			str = new String(bytes, "UTF-8");
			System.out.println("디코딩 문자: " + str);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		*/
		
		// String replace(char o, char n)
//		String oldStr = "java & jvm";
//		String newStr = oldStr.replace('j', 'k');
//		System.out.println(newStr);
		
		// String replace(CharSequence o, CharSequence n)
		String oldStr = "java & jvm available";
		String newStr = oldStr.replace("va", "bz");
		System.out.println(newStr);
		
		// substring
		System.out.println("\"" + oldStr.substring(3, 7) + "\"");
		System.out.println("\"" + oldStr.substring(10) + "\"");
		
		// trim() : 문자열 앞뒤 공백문자(탭, 줄바꿈, 스페이스) 제거
		String str = "    java programming  \t\r\n               ".trim();
		System.out.println("\"" + str + "\"");
		
		// toUpperCase() / toLowerCase()
		String upperCaseStr = str.toUpperCase();
		System.out.println("\"" + upperCaseStr + "\"");
		
		String lowerCaseStr = upperCaseStr.toLowerCase();
		System.out.println("toLowerCase: \"" + lowerCaseStr + "\"");
		
		// startsWith(String prefix)
		System.out.println("startsWith: " + lowerCaseStr.startsWith("jav"));
		System.out.println("startsWith: " + lowerCaseStr.startsWith("av"));
		
		// endsWith(String suffix)
		System.out.println("endsWith: " + lowerCaseStr.endsWith("ing"));
		System.out.println("endsWith: " + lowerCaseStr.endsWith("ling"));
		
		// int indexOf(String s)
		int i = "hey what the f***".indexOf("f***");
		System.out.println(i);
		
		System.out.println("-------------------------------");
		// static String valueOf(...)
		boolean b = true;
		System.out.println(String.valueOf(b)); // b가 true이면 "true" / false라면 "false"
		
		char[] cArr = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(String.valueOf(cArr));
		System.out.println(String.valueOf(cArr, 1, 3));	// cArr의 1번 인덱스 문자부터 3개 문자
		
		// static String valueOf(Object o)
		// o가 null이면 "null" 리턴
		//     아니면 o.toString() 리턴
		
	}
	
}
