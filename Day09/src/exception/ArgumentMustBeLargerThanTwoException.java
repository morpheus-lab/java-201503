package exception;

public class ArgumentMustBeLargerThanTwoException extends Exception {
	
	public ArgumentMustBeLargerThanTwoException() {
		super("���ڰ� �ݵ�� 2���� Ŀ����");
	}
	
	public ArgumentMustBeLargerThanTwoException(String message) {
		super(message);
	}
	
}
