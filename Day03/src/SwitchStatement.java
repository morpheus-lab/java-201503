
public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int a = 2;
		
		switch(a) {
		case 0:
			System.out.println("0�̱���~");
			break;
		case 1:
			System.out.println("1�̱���~");
			break;
		case 2:
			System.out.println("2�̱���~");
			break;
		case 3:
			System.out.println("3�̱���~");
			break;
		default:
			System.out.println("0,1,2,3�� �ƴϳ׿�");
		}
		
		if (a == 0) {
			System.out.println("0�̱���~");
		} else if (a == 1) {
			System.out.println("1�̱���~");
		} else if (a == 2) {
			System.out.println("2�̱���~");
		} else if (a == 3) {
			System.out.println("3�̱���~");
		} else {
			System.out.println("0,1,2,3�� �ƴϳ׿�");
		}
		
	}
	
}
