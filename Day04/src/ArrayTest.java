
public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] arr;	// intŸ���� �����͸� ���� �� ������ �� �ִ� ���𰡸� ����Ű��
					// ���� ���� arr�� ����
		arr = new int[5];	// int�� �����Ͱ� 5�� ����� �� �ִ� �迭 ��ü�� �������
							// ��� ��Ұ� 0���� �ʱ�ȭ��
		
		int[] arr2 = {1,3,5,7,9,11};	// int�� �����Ͱ� 5�� ����� �� �ִ� �迭 ��ü�� �������
									// ��� ��Ұ� ������ �����ͷ� �ʱ�ȭ��
		
		System.out.println(arr2[1]);	// �ε����� 0���� �����ϹǷ� 2��° ��Ҹ� �ǹ�
		
		for (int i = 0; i < arr2.length; i++) {	// length => �迭 ũ�⸦ ���� �ִ� ����
			System.out.println(arr2[i]);
		}
		
		
		
	}
	
}
