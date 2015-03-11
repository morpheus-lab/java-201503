
public class CallByTest {
	
	static void m() {}
	
	static void m(int i) {
		i = 99;
	}
	
	static void m(int[] arr) {
		arr[0] = 99;
	}
	
	public static void main(String[] args) {
		m();
		
		int i = 10;
		m(i);
		System.out.println(i);
		
		int[] arr = {10, 20, 30};
		m(arr);
		System.out.println(arr[0]);
	}
	
}
