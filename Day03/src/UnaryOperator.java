
public class UnaryOperator {	// 단항연산자
	
	public static void main(String[] args) {
		
		int opr = 0;
		opr += 3;					// opr = opr + 3;
		
		System.out.println(opr++);	// 3 => 출력 후 증가
		System.out.println(opr);	// 4
		System.out.println(++opr);	// 증가 후 출력 => 5
		System.out.println(opr);	// 5
		
		System.out.println(opr--);	// 5 => 출력 후 감소
		System.out.println(opr);	// 4
		System.out.println(--opr);	// 감소 후 출력 => 3
		System.out.println(opr);	// 3
		
	}
	
}
