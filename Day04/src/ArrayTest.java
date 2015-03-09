
public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] arr;	// int타입의 데이터를 여러 개 저장할 수 있는 무언가를 가리키는
					// 참조 변수 arr을 선언
		arr = new int[5];	// int형 데이터가 5개 저장될 수 있는 배열 객체가 만들어짐
							// 모든 요소가 0으로 초기화됨
		
		int[] arr2 = {1,3,5,7,9,11};	// int형 데이터가 5개 저장될 수 있는 배열 객체가 만들어짐
									// 모든 요소가 지정된 데이터로 초기화됨
		
		System.out.println(arr2[1]);	// 인덱스는 0부터 시작하므로 2번째 요소를 의미
		
		for (int i = 0; i < arr2.length; i++) {	// length => 배열 크기를 갖고 있는 변수
			System.out.println(arr2[i]);
		}
		
		
		
	}
	
}
