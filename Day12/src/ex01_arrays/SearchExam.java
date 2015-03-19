package ex01_arrays;

import java.util.Arrays;

public class SearchExam {
	
	public static void main(String[] args) {
		
		// �⺻ Ÿ�� ������ �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
		
		System.out.println("-------------");
		
		// ���ڿ� ������ �˻�
		String[] names = {"ȫ�浿", "�̸���", "�����"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "�̸���");
		System.out.println("ã�� �ε���: " + index);
		
		System.out.println("-------------");
		
		// �Ϲ� ��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�̸���");
		Member m3 = new Member("�����");
		Member[] members = {m1, m2, m3};	// �������� ���� �ִ� �迭
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);	// ���������� �˻�
		System.out.println("ã�� �ε���: " + index);
	}
	
}
