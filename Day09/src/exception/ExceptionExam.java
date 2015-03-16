package exception;

public class ExceptionExam {
	
	public static void main(String[] args) {
		
		// ���� �߻��ϴ� ����
		
		// ArithmeticException => ��� ���� ����
		
		// NullPointerException
//		try {
//			int[] arr = null;
//			arr[0] = 10;
//		} catch (NullPointerException e) {
//			System.out.println("null ���۷����� ����!!!");
//		}
		
		// ClassCastException	 => ��ȯ�� �� ���� Ŭ���� Ÿ������ ��ȯ���� ��
		
		// OutOfMemoryError	=> JVM�� ����� �� �ִ� �޸𸮸� �Ѿ ����Ϸ� �õ����� ��
		
		// ArrayIndexOutOfBoundsException	=> �迭�� �ε��� ������ �Ѿ ���� ��
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
		// intArr[5] = intArr[4] + 4 + 1 = ?		// i == 4	==> ArrayIndexOutOfBoundsException �߻�
		
		// IllegalArgumentException => �߸��� ���� ���� ��
		
		// IOException => ����� ó�� �� ���� �Ǵ� ���ͷ�Ʈ �߻� ��
		
		// NumberFormatException
		String[] stringNumbers = {"23", "123", "998", "3.141592"};
		try {
			for (int i = 0; i < stringNumbers.length; i++) {
				int j = Integer.parseInt(stringNumbers[i]);
				System.out.println("���ڷ� ��ȯ�� ���� " + j);
			}
		} catch (NumberFormatException e) {
			// NumberFormatException Ÿ���� ���ܰ� �߻��ϸ� �̰����� �̵�
			System.out.println("���ڷ� �Ľ�(parsing)�� �� �����ϴ�.");
			System.out.println("���� �޽���: " + e.getMessage());
		}
		
		System.out.println("main �޼ҵ� ����");
	}
	
}
























