package system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTimeTest {
	
	public static void main(String[] args) throws IOException {
		
		long startTime = System.currentTimeMillis();
		
		File f = new File("D:\\NineChun(Last).zip");
		FileInputStream fin = new FileInputStream(f);
		FileOutputStream fout = new FileOutputStream("D:\\copy.zip");
		int data = 0;
		while ((data = fin.read()) != -1) {
			fout.write(data);
		}
		fin.close();
		fout.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("파일 복사에 걸린 시간: " + (endTime - startTime) + "ms");
	}
	
}
