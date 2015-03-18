package system.api.object.clone;

public class ShallowCopyTest {
	
	static class A implements Cloneable {
		// �ʵ�
		private int i = 1;
		private int[] arr = {1, 2, 3};
		// ������
		public A(int i) {set(i);}
		// �޼ҵ�
		public void set(int i) {this.i = i; arr[0] = i;}
		public int getI() {return i;}	// i�� getter �޼ҵ�
		public int[] getArr() {return arr;}	// arr�� getter �޼ҵ�
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
