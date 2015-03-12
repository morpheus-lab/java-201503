package casting;

public class CastingTestMain {
	
	static void run(Car c) {
		// c�� Car�μ� ���
		c.accel();
		
		// ����
		if (c instanceof FireEngine) {	// c �������� ����Ű�� �ִ� ��ü�� FireEngine Ÿ��?
			((FireEngine) c).fireOff();
		}
		else if (c instanceof Ambulance) {
			((Ambulance) c).giveCareToPatient();
		}
		else {
			System.out.println("�׳� �ڵ����׿�...");
		}
		
		c.stop();
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car(), c2 = new FireEngine(), c3 = new Ambulance();// c2, c3���� �Ͼ �� => ��ĳ����
		
//		run(c1);
//		run(c2);
		run(c3);
		
		// Car�μ� ���
//		c1.accel();
//		c2.accel();
//		c3.accel();
		
//		c2.fireOff();	// �Ұ���!
		
		// c2�� FireEngine���� ����Ϸ��� => c2�� FireEngine Ÿ������ ����
//		FireEngine f = (FireEngine) c2;
//		f.fireOff();
		
	}
	
}
