package ex03_collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExam {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("È«±æµ¿", "ÀÌ¸ù·æ", "¼ºÃáÇâ");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		for (int value : list2) {
			System.out.println(value);
		}
		
	}
	
}
