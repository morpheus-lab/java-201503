package interfaces;

interface Car {
	/* public abstract */ void run();	// 모든 메소드가 추상메소드여야 함
}

class Property {	// 재산
	double value;
	double valuate() {return value;}
}

class FireEngine extends Property implements Car {
	void fireOff() {}
	public void run() {}
}

class Ambulance implements Car {
	void careOf() {}
	public void run() {}
}

public class InterfaceTest {
	public static void main(String[] args) {
		Car c = new FireEngine();
		c.run();
		
		Property p = (Property) c;
		System.out.println(p.valuate());
	}
}
