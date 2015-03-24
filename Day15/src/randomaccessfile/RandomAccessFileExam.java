package randomaccessfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExam {
	
	public static void main(String[] args) {
		RandomAccessFile rFile = null;
		try {
//			rFile = new RandomAccessFile(file, mode);
			rFile = new RandomAccessFile("D:\\test.txt", "rw");
			
			rFile.seek(10);	// 특정 위치로 커서 이동
			int data = rFile.read();	// 데이터 1바이트 읽음
			System.out.println((char) data);
			
			data = rFile.read();	// 데이터 1바이트 읽음
			System.out.println((char) data);
			
			rFile.seek(0);
			data = rFile.read();	// 데이터 1바이트 읽음
			System.out.println((char) data);
			
			rFile.seek(16);	// 커서를 16번 인덱스로 옮김
			data = rFile.read();	// 데이터 1바이트 읽음
			System.out.println(data);
			
			data = rFile.read();	// 데이터 1바이트 읽음
			System.out.println(data);
			
			data = rFile.read();	// 데이터 1바이트 읽음
			System.out.println((char) data);
			
			rFile.write('p');
			rFile.writeBytes("ple");
			rFile.write('\r');
			rFile.write(10);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류 발생!");
		} finally {
			if (rFile != null)
				try {
					rFile.close();
				} catch (IOException e) {}
		}
	}
	
}
