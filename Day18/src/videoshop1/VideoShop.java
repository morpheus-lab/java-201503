package videoshop1;

import java.util.ArrayList;
import java.util.List;

class Video {
	String title;
	long playTime;
	public Video(String title, long playTime) {
		this.title = title;
		this.playTime = playTime;
	}
}

public class VideoShop {
	
	// ���� �����
	List<Video> vList = new ArrayList<Video>();
	
	public VideoShop() {
		vList.add(new Video("����������-1", 5000));
		vList.add(new Video("����������-2", 5000));
		vList.add(new Video("����������-3", 5000));
//		vList.add(new Video("����������-4", 5000));
//		vList.add(new Video("����������-5", 5000));
	}
	
	// ���� �����ֱ�
	public synchronized Video lendVideo() throws InterruptedException {
		Video v = null;
		
		while (vList.size() == 0) {
			Thread ct = Thread.currentThread();	// �� �ڵ带 �����ϴ� ������ ����
			System.out.println(ct.getName() + ": ������ ����");
			this.wait();
			System.out.println(ct.getName() + ": ������ ����");
		}
		
		v = vList.remove(vList.size() - 1);
		
		return v;
	}
	
	// ���� �ݳ��ޱ�
	public synchronized void returnVideo(Video video) {
		vList.add(video);	// ���� ����� ����
//		this.notify();
		this.notifyAll();
	}
	
}




























