package inheritance.exam2;

public class TestMain {
	
	public static void main(String[] args) {
		
//		A a = new A();
//		a.f = 10;
//		System.out.println(a.f);
		
		B b = new B();
		
		System.out.println(b.f);
		b.f = 1;
		
		b.setSuperF(7);
		
		System.out.println("b.f = " + b.f);
		System.out.println("b °´Ã¼ÀÇ super.f = " + b.getSuperF());
		
	}
	
}
