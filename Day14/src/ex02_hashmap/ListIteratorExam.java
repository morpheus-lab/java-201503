package ex02_hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExam {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("È«±æµ¿");
		list.add("º¯ÇÐµµ");
		list.add("ÀÌ¸ù·æ");
		list.add("¼ºÃáÇâ");
		list.add("½ÉºÀ»ç");
		
//		list.sort(null);
//		Collections.reverse(list);
//		Collections.sort(list);
		Collections.shuffle(list);
		
		Iterator<String> iter = list.iterator();
//		iter.hasNext();
//		iter.next();
		
		ListIterator<String> listIter = list.listIterator();
//		listIter.hasNext();
//		listIter.next();
//		listIter.hasPrevious();
//		listIter.previous();
		
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		
//		while (listIter.hasPrevious()) {
//			System.out.println(listIter.previous());
//		}
		
	}
	
}
