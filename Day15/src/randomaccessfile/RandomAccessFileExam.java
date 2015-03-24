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
			
			rFile.seek(10);	// Ư�� ��ġ�� Ŀ�� �̵�
			int data = rFile.read();	// ������ 1����Ʈ ����
			System.out.println((char) data);
			
			data = rFile.read();	// ������ 1����Ʈ ����
			System.out.println((char) data);
			
			rFile.seek(0);
			data = rFile.read();	// ������ 1����Ʈ ����
			System.out.println((char) data);
			
			rFile.seek(16);	// Ŀ���� 16�� �ε����� �ű�
			data = rFile.read();	// ������ 1����Ʈ ����
			System.out.println(data);
			
			data = rFile.read();	// ������ 1����Ʈ ����
			System.out.println(data);
			
			data = rFile.read();	// ������ 1����Ʈ ����
			System.out.println((char) data);
			
			rFile.write('p');
			rFile.writeBytes("ple");
			rFile.write('\r');
			rFile.write(10);
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ���� �߻�!");
		} finally {
			if (rFile != null)
				try {
					rFile.close();
				} catch (IOException e) {}
		}
	}
	
}
