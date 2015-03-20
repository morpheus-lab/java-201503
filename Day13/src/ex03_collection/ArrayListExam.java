package ex03_collection;

import java.util.List;		// 리스트 자료구조에 대한 인터페이스
import java.util.ArrayList;	// 리스트 구현체 (ArrayList implements List)

public class ArrayListExam {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("Spring");
		
		System.out.println(list);
		
		int size = list.size();
		System.out.println("저장된 객체 총 개수: " + size);
		
		String s = list.get(1);
		System.out.println("1번 데이터: " + s);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String ithData = list.get(i);
			System.out.println(i + "번 데이터: " + ithData);
		}
		
		list.remove(2);			// "Database" 삭제됨
		list.remove("JDBC");	// "JDBC" 삭제됨
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String ithData = list.get(i);
			System.out.println(i + "번 데이터: " + ithData);
		}
		
	}
	
}

























