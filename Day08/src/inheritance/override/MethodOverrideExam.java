package inheritance.override;

class A {
	int a;
	long b;
	protected void m1() {System.out.println("A�� m1()");}
	private void m2() {}
	void m3() {}
	public void m4() {}
	public void m5(int a) {}
}

class B extends A {
	double a;
	protected void m1() {System.out.println("B�� m1()");}
	
	public void m5() {}	// override �ƴ�, overload�� �� �� ����
	
	public void m5(int i) {}	// override ����
	
	public void m5(int i, int j) {}	// override �ƴϰ�, overload
	
}

public class MethodOverrideExam {
	public static void main(String[] args) {
		B b = new B();
		b.a = 10;
		
		A a = b;
		
		System.out.println(b.a);
		System.out.println(a.a);
		
		b.m1();
		a.m1();
		
	}
}
