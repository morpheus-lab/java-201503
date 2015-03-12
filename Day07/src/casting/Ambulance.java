package casting;

public class Ambulance extends Car {
	
	// Car로부터 accel(), stop() 상속 받음
	
	void giveCareToPatient() {
		System.out.println("환자를 치료합니다.");
	}
	
}
