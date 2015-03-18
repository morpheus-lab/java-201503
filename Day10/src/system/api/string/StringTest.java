package system.api.string;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "To be or not to be";
		String s2 = "To be or not to be";
		
		System.out.println("s1과 s2가 같은 객체? " + (s1 == s2));
		
		String s3 = new String("To be or not to be");
		String s4 = new String("To be or not to be");
		
		System.out.println("s3과 s4가 같은 객체? " + (s3 == s4));
		
		System.out.println("s3의 길이: " + s3.length());
		
		System.out.println("가나다".length());
	}
}
