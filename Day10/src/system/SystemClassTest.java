package system;

public class SystemClassTest {
	
	public static void main(String[] args) {
		
//		System s = new System();
		
		System.out.println("����ð�: " + System.currentTimeMillis());
		
		System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
		
		long startTime = System.currentTimeMillis();
		
		int count = 0;
		for (int i = 0; i < 999999999; i++) {
			count++;
		}
		
		long elapsedTime = System.currentTimeMillis() - startTime;
		
		System.out.println("�ҿ�ð�: " + elapsedTime + "ms");
		
	}
	
}
