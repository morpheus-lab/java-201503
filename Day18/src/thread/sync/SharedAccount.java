package thread.sync;

class BankAccount {
	private int balance = 10000;	// �����ܾ�
	
	public synchronized void deposit(int amount) {	// amount �ݾ׸�ŭ �Ա�
		// �ܾ� ��ȸ
		int n = balance;
		// �Աݾ� �߰�
		n += amount;
		try {
			Thread.sleep(3000);	// �Ա� ó�� �ð�: 3��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// �ܾ� �ݿ�
		balance = n;
		System.out.println(Thread.currentThread().getName()
				+ ": " + amount + "�� �Ա� �Ϸ�. �ܰ�: " + balance);
	}
	
	public synchronized void withdraw(int amount) {	// amount �ݾ׸�ŭ ���
		int n = balance;
		n -= amount;
		try {
			Thread.sleep(500);	// ��� ó�� �ð�: 0.5��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = n;
		System.out.println(Thread.currentThread().getName()
				+ ": " + amount + "�� ��� �Ϸ�. �ܰ�: " + balance);
	}
	
}

class MrPark extends Thread {
	public MrPark(String name) {
		super(name);	// ������ �̸� ����
	}
	public void run() {
		// �ھ��� �������� ������μ� ����
		// �Ա�
		SharedAccount.sharedAccount.deposit(3000);
	}
}

class ParkWife extends Thread {
	public ParkWife(String name) {
		super(name);
	}
	public void run() {
		// �ھ� ������ �������� ������μ� �� ��
		// ���
		SharedAccount.sharedAccount.withdraw(5000);
	}
}

public class SharedAccount {
	
	static BankAccount sharedAccount = new BankAccount();	// �ھ��� �ھ� ������ ���� ����
	
	public static void main(String[] args) throws InterruptedException {
		MrPark park = new MrPark("�ھ�");
		ParkWife wife = new ParkWife("�ھ�����");
		
//		Thread.sleep(3500);
		wife.start();	// �ھ� ���� ������ ����
		park.start();	// �ھ� ������ ����
	}
}
