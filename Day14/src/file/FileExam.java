package file;

import java.io.File;
import java.io.IOException;

public class FileExam {
	
	public static void main(String[] args) throws IOException {
		
//		File f = new File("D:\\test.txt");
		File f = new File("D:\\", ".\\test.txt");
		
		System.out.println("������ ����? " + f.exists());
		System.out.println("���� ũ��: " + f.length());
		System.out.println("���� ���� ����: " + f.canWrite());
		
		System.out.println("���� ���� ���: " + f.getAbsolutePath());
		System.out.println("���� ���� ���: " + f.getCanonicalPath());
		
	}
	
}
