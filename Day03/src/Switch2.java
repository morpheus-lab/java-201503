
public class Switch2 {
	
	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("90~100점입니다.");
			break;
		case 'B':
			System.out.println("80~89점입니다.");
			break;
		default:
			System.out.println("80점 미만");
		}
		
		/*
		int i = 0;
		
		// 5로 나눈 나머지가 얼마냐에 따라 다른 처리
		
		if (i % 5 == 0) {
			
		} else if (i % 5 == 1) {
			
		} //...
		
		switch (i % 5) {
		case 0:
			System.out.println("5의 배수이군요!");
			break;
		case 1:
			break;
		case 2:
			break;
		}
		*/
	}
	
}
