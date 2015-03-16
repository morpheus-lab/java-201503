package exception;

public class ArgumentMustBeLargerThanTwoException extends Exception {
	
	public ArgumentMustBeLargerThanTwoException() {
		super("인자가 반드시 2보다 커야함");
	}
	
	public ArgumentMustBeLargerThanTwoException(String message) {
		super(message);
	}
	
}
