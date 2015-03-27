package thread.sync;

class BankAccount {
	private int balance = 10000;	// 계좌잔액
	
	public synchronized void deposit(int amount) {	// amount 금액만큼 입금
		// 잔액 조회
		int n = balance;
		// 입금액 추가
		n += amount;
		try {
			Thread.sleep(3000);	// 입금 처리 시간: 3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 잔액 반영
		balance = n;
		System.out.println(Thread.currentThread().getName()
				+ ": " + amount + "원 입금 완료. 잔고: " + balance);
	}
	
	public synchronized void withdraw(int amount) {	// amount 금액만큼 출금
		int n = balance;
		n -= amount;
		try {
			Thread.sleep(500);	// 출금 처리 시간: 0.5초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = n;
		System.out.println(Thread.currentThread().getName()
				+ ": " + amount + "원 출금 완료. 잔고: " + balance);
	}
	
}

class MrPark extends Thread {
	public MrPark(String name) {
		super(name);	// 쓰레드 이름 지정
	}
	public void run() {
		// 박씨가 독립적인 쓰레드로서 할일
		// 입금
		SharedAccount.sharedAccount.deposit(3000);
	}
}

class ParkWife extends Thread {
	public ParkWife(String name) {
		super(name);
	}
	public void run() {
		// 박씨 부인이 독립적인 쓰레드로서 할 일
		// 출금
		SharedAccount.sharedAccount.withdraw(5000);
	}
}

public class SharedAccount {
	
	static BankAccount sharedAccount = new BankAccount();	// 박씨와 박씨 부인의 공유 계좌
	
	public static void main(String[] args) throws InterruptedException {
		MrPark park = new MrPark("박씨");
		ParkWife wife = new ParkWife("박씨부인");
		
//		Thread.sleep(3500);
		wife.start();	// 박씨 부인 쓰레드 시작
		park.start();	// 박씨 쓰레드 시작
	}
}
