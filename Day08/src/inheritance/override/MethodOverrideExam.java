package inheritance.override;

class A {
	int a;
	long b;
	protected void m1() {System.out.println("A의 m1()");}
	private void m2() {}
	void m3() {}
	public void m4() {}
	public void m5(int a) {}
}

class B extends A {
	double a;
	protected void m1() {System.out.println("B의 m1()");}
	
	public void m5() {}	// override 아님, overload로 볼 수 있음
	
	public void m5(int i) {}	// override 맞음
	
	public void m5(int i, int j) {}	// override 아니고, overload
	
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
