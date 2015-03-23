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
			
			// lowIn���κ��� ������ �о ȭ�鿡 ���
//			int data;
//			while ((data = lowIn.read()) != -1) {
//				System.out.print((char) data);
//			}
			
			byte[] b = new byte[10];	// ������ �о�� �׸�
			int readBytes;	// ���� ����Ʈ ��
			while ((readBytes = lowIn.read(b)) != -1) {
				for (int i = 0; i < readBytes; i++) {
					System.out.print((char) b[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("���Ϸκ��� �����͸� �д� �߿� ���� �߻�");
		} finally {
			if (lowIn != null)
				try {
					lowIn.close();
				} catch (IOException e) {}
		}
	}
	
}
