package system.api.string;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "To be or not to be";
		String s2 = "To be or not to be";
		
		System.out.println("s1�� s2�� ���� ��ü? " + (s1 == s2));
		
		String s3 = new String("To be or not to be");
		String s4 = new String("To be or not to be");
		
		System.out.println("s3�� s4�� ���� ��ü? " + (s3 == s4));
		
		System.out.println("s3�� ����: " + s3.length());
		
		System.out.println("������".length());
	}
}
