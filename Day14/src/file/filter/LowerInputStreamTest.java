package file.filter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LowerInputStreamTest {
	
	public static void main(String[] args) {
		
		LowerCaseFilterInputStream lowIn = null;
		
		try {
			File f = new File("D:\\test.txt");
			FileInputStream in = new FileInputStream(f);
			
			lowIn = new LowerCaseFilterInputStream(in);
			
			// lowIn으로부터 데이터 읽어서 화면에 출력
//			int data;
//			while ((data = lowIn.read()) != -1) {
//				System.out.print((char) data);
//			}
			
			byte[] b = new byte[10];	// 데이터 읽어올 그릇
			int readBytes;	// 읽은 바이트 수
			while ((readBytes = lowIn.read(b)) != -1) {
				for (int i = 0; i < readBytes; i++) {
					System.out.print((char) b[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일로부터 데이터를 읽는 중에 오류 발생");
		} finally {
			if (lowIn != null)
				try {
					lowIn.close();
				} catch (IOException e) {}
		}
	}
	
}
