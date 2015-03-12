package casting;

public class FireEngine extends Car {
	
	// Car로부터 accel(), stop()을 상속 받음
	
	void fireOff() {
		System.out.println("화재를 진압합니다.");
	}
	
}
