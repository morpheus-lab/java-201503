package world.asia;

public class Japan {
	
	void test() {
		Korea k = new Korea();
		k.i = 100;	// public => OK
		k.capital = "�漺";	// (package) => OK
		k.population = 10000;	// private => ���� �Ұ� => ������ ���� �߻�
	}
	
}
