package system.api.object.clone;

public class ShallowCopyTest {
	
	static class A implements Cloneable {
		// 필드
		private int i = 1;
		private int[] arr = {1, 2, 3};
		// 생성자
		public A(int i) {set(i);}
		// 메소드
		public void set(int i) {this.i = i; arr[0] = i;}
		public int getI() {return i;}	// i의 getter 메소드
		public int[] getArr() {return arr;}	// arr의 getter 메소드
		public void print() {System.out.println("i=" + i + ", arr[0]=" + arr[0]);}
		@Override
		public A clone() throws CloneNotSupportedException {
			A clone = (A) super.clone();
			clone.arr = this.arr.clone();
			return clone;
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A(10);
		A aCopy = a.clone();
		a.print();
		aCopy.print();
		
		System.out.println("-------------------");
		
		a.set(20);
		a.print();
		aCopy.print();
	}
	
}
