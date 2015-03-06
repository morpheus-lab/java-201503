
public class BitShiftOperator {
	
	public static void main(String[] args) {
		
		short a = (short) 0x55ff;	// 0101 0101 1111 1111 
		short b = 0x00ff;			// 0000 0000 1111 1111
		
						// AND	// a&b 0000 0000 1111 1111	=> 0x00ff
						// OR	// a|b 0101 0101 1111 1111	=> 0x55ff
						// XOR	// a^b 0101 0101 0000 0000	=> 0x5500
								// ~a  1010 1010 0000 0000	=> 0xAA00
		
		// 비트 연산
		System.out.printf("%x\n", a & b); // a & b 의 결과를 16진수 형식으로 출력
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		// a => int로 취급 0x000055ff	0000 0000 0000 0000 0101 0101 1111 1111
		//								1111 1111 1111 1111 1010 1010 0000 0000 => 0xFFFFAA00
		
		System.out.printf("%x\n", (short) ~a);
		
		byte c = 20;	// 0x14		0001 0100
		byte d = -8;	// 0xf8		1111 1000
		
		// 쉬프트 연산
		System.out.println(c << 2);	// 0101 0000	2^6 + 2^4 = 64 + 16 = 80
		System.out.println(c >> 2);	// 0000 0101	2^2 + 2^0 = 4 + 1 = 5
		System.out.println(d >> 2);	// 1111 1110
		System.out.printf("%x\n", d >>> 2);	// 0011 1110
	}
	
}
