package system.api.string;

public class StringMethodTest {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "A";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("------------------");
		
		s1 = "hello";
		s2 = "hi";
		
		System.out.println(s1.compareTo(s2));
		
		// s1.compareTo(s2) �� ����� ������� ���������� s1�� �� �ռ�
		//                            0 �̶�� ������ ���ڿ�
		//                            ������ ���������� s2�� �� �ռ�
	}
}
