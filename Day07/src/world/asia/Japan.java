package world.asia;

public class Japan {
	
	void test() {
		Korea k = new Korea();
		k.i = 100;	// public => OK
		k.capital = "경성";	// (package) => OK
		k.population = 10000;	// private => 접근 불가 => 컴파일 에러 발생
	}
	
}
