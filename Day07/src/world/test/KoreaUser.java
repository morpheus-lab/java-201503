package world.test;

import world.asia.Korea;
//import world.asia.*;

public class KoreaUser {	// world.asia.Korea Ŭ������ �̿��ϴ� Ŭ����
	
	public static void main(String[] args) {
		
		Korea k = new Korea();
		
		k.i = 5;	// public ��� ������ ���� OK
		k.capital = "�Ѿ�";	// (package) ��� ����
							// => �ٸ� ��Ű���� ���� �ִ� KoreaUser�μ���
							//    �� �� ���� (������ �ִ�) ��� ����
							// => ������ ���� �߻�
		k.population = 1000;	// private ��� ������ Korea Ŭ���� �ܺο����� �� ������ ���� �Ұ�
								// ������ ���� �߻�
	}
	
}
