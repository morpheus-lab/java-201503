package videoshop1;

public class Customer extends Thread {
	
	public void run() {
		try {
			// 비디오 빌림
			Video v = VideoShopMain.vShop.lendVideo();
			System.out.println(getName() + ": " + v.title + " 대여완료");
			
			// 상영시간동안 비디오 보기
			System.out.println(getName() + ": " + v.title + " 비디오를 봅니다.");
			try {
				Thread.sleep(v.playTime);
			} catch (InterruptedException e) {}
			System.out.println(getName() + ": " + v.title + " 비디오를 다 봤습니다.");
			
			// 비디오 반납
			System.out.println(getName() + ": " + v.title + " 비디오를 반납합니다.");
			VideoShopMain.vShop.returnVideo(v);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
