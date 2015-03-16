package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ThrowTestChild extends ThrowTest {
	@Override
	public FileInputStream openFile(String fileName) {	// ���� Ŭ�������� �������̵��ϴ� ���,
														// throws ���� ��� �ȴ�.
														// ������, throws ���� �� ��쿡��
														// �ݵ�� ���� Ŭ������ throws ���� ���ǵǾ� �ִ�
														// ���� Ŭ������ ���� Ÿ��, �Ǵ� �� ���� Ÿ���� ����
														// Ŭ������ throws���� �� �� �ִ�.
		return null;
	}
}

public class ThrowTest {
	
	public void test1() {
		int i = 99 / 0;	// ArithmeticException �߻���
	}
	
	public FileInputStream openFile(String fileName) throws FileNotFoundException {
		FileInputStream in = new FileInputStream(fileName);
		return in;
	}
	
	public static void main(String[] args) {
		
//		try {
//			throw (new Exception());	// ������ ���� �߻�
//		} catch (Exception e) {
//			
//		}
		
		ThrowTest tt = new ThrowTest();
		tt.test1();
		try {
			tt.openFile("D:\\test1.txt");
		} catch (FileNotFoundException e) {
			
		}
		
		ThrowTestChild ttc = new ThrowTestChild();
		ttc.openFile("");
		
	}
	
}
