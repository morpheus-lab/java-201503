package interfaces;

interface Car {
	/* public abstract */ void run();	// ��� �޼ҵ尡 �߻�޼ҵ忩�� ��
}

class Property {	// ���
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
