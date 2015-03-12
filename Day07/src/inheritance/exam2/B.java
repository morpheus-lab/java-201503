package inheritance.exam2;

public class B extends A {
	
	int f;
	int f2;
	void m2() {
		System.out.println("B¿« m2() »£√‚µ ");
	}
	
	void setSuperF(int a) {
		super.f = a;
	}
	
	int getSuperF() {
		return super.f;
	}
}
