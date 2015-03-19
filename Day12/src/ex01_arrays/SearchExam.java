package ex01_arrays;

import java.util.Arrays;

public class SearchExam {
	
	public static void main(String[] args) {
		
		// 기본 타입 데이터 검색
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		System.out.println("-------------");
		
		// 문자열 데이터 검색
		String[] names = {"홍길동", "이몽룡", "변사또"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "이몽룡");
		System.out.println("찾은 인덱스: " + index);
		
		System.out.println("-------------");
		
		// 일반 객체 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("이몽룡");
		Member m3 = new Member("변사또");
		Member[] members = {m1, m2, m3};	// 참조값을 갖고 있는 배열
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);	// 참조값으로 검색
		System.out.println("찾은 인덱스: " + index);
	}
	
}
