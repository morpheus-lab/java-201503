
public class ArrayExceptionTest {
	
	public static void main(String[] args) {
		
//		int[] a = {1, 2};
		int a[] = {1, 2};
		
//		System.out.println(a[-1]);
			// ArrayIndexOutOfBoundsException �߻�
//		System.out.println(a[2]);
			// ArrayIndexOutOfBoundsException �߻�
		a = null;
		
		a[0] = 3;	// NullPointerException �߻�
		
	}
	
}
