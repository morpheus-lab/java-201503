package ex03_collection;

import java.util.List;		// ����Ʈ �ڷᱸ���� ���� �������̽�
import java.util.ArrayList;	// ����Ʈ ����ü (ArrayList implements List)

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
		System.out.println("����� ��ü �� ����: " + size);
		
		String s = list.get(1);
		System.out.println("1�� ������: " + s);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String ithData = list.get(i);
			System.out.println(i + "�� ������: " + ithData);
		}
		
		list.remove(2);			// "Database" ������
		list.remove("JDBC");	// "JDBC" ������
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String ithData = list.get(i);
			System.out.println(i + "�� ������: " + ithData);
		}
		
	}
	
}

























