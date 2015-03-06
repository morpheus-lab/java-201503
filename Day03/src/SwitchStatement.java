
public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int a = 2;
		
		switch(a) {
		case 0:
			System.out.println("0이군요~");
			break;
		case 1:
			System.out.println("1이군요~");
			break;
		case 2:
			System.out.println("2이군요~");
			break;
		case 3:
			System.out.println("3이군요~");
			break;
		default:
			System.out.println("0,1,2,3도 아니네요");
		}
		
		if (a == 0) {
			System.out.println("0이군요~");
		} else if (a == 1) {
			System.out.println("1이군요~");
		} else if (a == 2) {
			System.out.println("2이군요~");
		} else if (a == 3) {
			System.out.println("3이군요~");
		} else {
			System.out.println("0,1,2,3도 아니네요");
		}
		
	}
	
}
