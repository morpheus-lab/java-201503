package file;

import java.io.File;
import java.io.IOException;

public class FileExam {
	
	public static void main(String[] args) throws IOException {
		
//		File f = new File("D:\\test.txt");
		File f = new File("D:\\", ".\\test.txt");
		
		System.out.println("파일이 존재? " + f.exists());
		System.out.println("파일 크기: " + f.length());
		System.out.println("파일 쓰기 권한: " + f.canWrite());
		
		System.out.println("파일 절대 경로: " + f.getAbsolutePath());
		System.out.println("파일 절대 경로: " + f.getCanonicalPath());
		
	}
	
}
