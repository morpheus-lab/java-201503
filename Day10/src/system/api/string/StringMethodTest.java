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
		
		// s1.compareTo(s2) 의 결과가 음수라면 사전순서상 s1이 더 앞섬
		//                            0 이라면 동일한 문자열
		//                            양수라면 사전순서상 s2가 더 앞섬
	}
}
