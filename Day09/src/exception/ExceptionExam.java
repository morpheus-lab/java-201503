package exception;

public class ExceptionExam {
	
	public static void main(String[] args) {
		
		// 자주 발생하는 예외
		
		// ArithmeticException => 산술 연산 예외
		
		// NullPointerException
//		try {
//			int[] arr = null;
//			arr[0] = 10;
//		} catch (NullPointerException e) {
//			System.out.println("null 레퍼런스에 접근!!!");
//		}
		
		// ClassCastException	 => 변환할 수 없는 클래스 타입으로 변환했을 때
		
		// OutOfMemoryError	=> JVM이 사용할 수 있는 메모리를 넘어서 사용하려 시도했을 때
		
		// ArrayIndexOutOfBoundsException	=> 배열의 인덱스 범위를 넘어서 접근 시
//		int[] intArr = new int[5];
//		for (int i = 0; i < 5; i++) {
//			intArr[i + 1] = intArr[i] + i + 1;
//			System.out.println("intArr[" + (i + 1) + "] = " + intArr[i + 1]);
//		}
		// intArr[0] = 0
		// intArr[1] = intArr[0] + 0 + 1 = 1		// i == 0
		// intArr[2] = intArr[1] + 1 + 1 = 3		// i == 1
		// intArr[3] = intArr[2] + 2 + 1 = 6		// i == 2
		// intArr[4] = intArr[3] + 3 + 1 = 10		// i == 3
		// intArr[5] = intArr[4] + 4 + 1 = ?		// i == 4	==> ArrayIndexOutOfBoundsException 발생
		
		// IllegalArgumentException => 잘못된 인자 전달 시
		
		// IOException => 입출력 처리 시 실패 또는 인터럽트 발생 시
		
		// NumberFormatException
		String[] stringNumbers = {"23", "123", "998", "3.141592"};
		try {
			for (int i = 0; i < stringNumbers.length; i++) {
				int j = Integer.parseInt(stringNumbers[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		} catch (NumberFormatException e) {
			// NumberFormatException 타입의 예외가 발생하면 이곳으로 이동
			System.out.println("숫자로 파싱(parsing)할 수 없습니다.");
			System.out.println("예외 메시지: " + e.getMessage());
		}
		
		System.out.println("main 메소드 종료");
	}
	
}
























