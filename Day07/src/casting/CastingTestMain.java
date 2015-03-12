package casting;

public class CastingTestMain {
	
	static void run(Car c) {
		// c를 Car로서 사용
		c.accel();
		
		// 복원
		if (c instanceof FireEngine) {	// c 참조값이 가리키고 있는 객체가 FireEngine 타입?
			((FireEngine) c).fireOff();
		}
		else if (c instanceof Ambulance) {
			((Ambulance) c).giveCareToPatient();
		}
		else {
			System.out.println("그냥 자동차네요...");
		}
		
		c.stop();
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car(), c2 = new FireEngine(), c3 = new Ambulance();// c2, c3에게 일어난 일 => 업캐스팅
		
//		run(c1);
//		run(c2);
		run(c3);
		
		// Car로서 사용
//		c1.accel();
//		c2.accel();
//		c3.accel();
		
//		c2.fireOff();	// 불가능!
		
		// c2를 FireEngine으로 사용하려면 => c2를 FireEngine 타입으로 복원
//		FireEngine f = (FireEngine) c2;
//		f.fireOff();
		
	}
	
}
