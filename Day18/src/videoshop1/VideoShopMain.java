package videoshop1;

public class VideoShopMain {
	
	static VideoShop vShop = new VideoShop();
	
	public static void main(String[] args) {
		
		// Customer 객체 생성
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();
		Customer c6 = new Customer();
		
		// Customer 쓰레드 시작
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
	}
	
}
