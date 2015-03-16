package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ThrowTestChild extends ThrowTest {
	@Override
	public FileInputStream openFile(String fileName) {	// 하위 클래스에서 오버라이드하는 경우,
														// throws 절은 없어도 된다.
														// 하지만, throws 절을 쓸 경우에는
														// 반드시 상위 클래스의 throws 절에 정의되어 있는
														// 예외 클래스와 같은 타입, 또는 그 하위 타입의 예외
														// 클래스만 throws절에 쓸 수 있다.
		return null;
	}
}

public class ThrowTest {
	
	public void test1() {
		int i = 99 / 0;	// ArithmeticException 발생됨
	}
	
	public FileInputStream openFile(String fileName) throws FileNotFoundException {
		FileInputStream in = new FileInputStream(fileName);
		return in;
	}
	
	public static void main(String[] args) {
		
//		try {
//			throw (new Exception());	// 강제로 예외 발생
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
