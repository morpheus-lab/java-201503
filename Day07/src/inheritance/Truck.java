package inheritance;

public class Truck extends Car {
	
	/*
	// Truck도 자동차이기 때문에 아래 특성 및 기능을 당연히 가짐
	
	// 중량
	double weight;
	
	// 엔진 시동하기
	void startEngine() {
		
	}
	
	// 달리기
	void accel() {
		
	}
	
	// 멈추기
	void stop() {
		
	}
	*/
	//------------------- 상속이라는 개념이 없다면 위와 같이 Car의 모든 내용이 중복적으로 정의돼야함 
	
	// 화물 싣기
	void load() {
		System.out.println("화물을 싣습니다.");
	}
	
	// 화물 내리기
	void unload() {
		System.out.println("화물을 내립니다.");
	}
	
}
