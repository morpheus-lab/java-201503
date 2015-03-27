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
	
	// 비디오 저장고
	List<Video> vList = new ArrayList<Video>();
	
	public VideoShop() {
		vList.add(new Video("반지의제왕-1", 5000));
		vList.add(new Video("반지의제왕-2", 5000));
		vList.add(new Video("반지의제왕-3", 5000));
//		vList.add(new Video("반지의제왕-4", 5000));
//		vList.add(new Video("반지의제왕-5", 5000));
	}
	
	// 비디오 빌려주기
	public synchronized Video lendVideo() throws InterruptedException {
		Video v = null;
		
		while (vList.size() == 0) {
			Thread ct = Thread.currentThread();	// 이 코드를 실행하는 쓰레드 정보
			System.out.println(ct.getName() + ": 대기상태 진입");
			this.wait();
			System.out.println(ct.getName() + ": 대기상태 해제");
		}
		
		v = vList.remove(vList.size() - 1);
		
		return v;
	}
	
	// 비디오 반납받기
	public synchronized void returnVideo(Video video) {
		vList.add(video);	// 비디오 저장고에 저장
//		this.notify();
		this.notifyAll();
	}
	
}




























