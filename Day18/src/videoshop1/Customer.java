package videoshop1;

public class Customer extends Thread {
	
	public void run() {
		try {
			// ���� ����
			Video v = VideoShopMain.vShop.lendVideo();
			System.out.println(getName() + ": " + v.title + " �뿩�Ϸ�");
			
			// �󿵽ð����� ���� ����
			System.out.println(getName() + ": " + v.title + " ������ ���ϴ�.");
			try {
				Thread.sleep(v.playTime);
			} catch (InterruptedException e) {}
			System.out.println(getName() + ": " + v.title + " ������ �� �ý��ϴ�.");
			
			// ���� �ݳ�
			System.out.println(getName() + ": " + v.title + " ������ �ݳ��մϴ�.");
			VideoShopMain.vShop.returnVideo(v);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
