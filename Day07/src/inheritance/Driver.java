package inheritance;

public class Driver {
	
	public static void main(String[] args) {
		
//		Car c = new Car();
//		c.startEngine();
//		c.accel();
//		c.stop();
//		c.weight = 2.0;
		
		Truck t = new Truck();
		t.startEngine();
		t.accel();
		t.stop();
		t.weight = 16.0;
		t.load();
		t.unload();
	}
	
}
