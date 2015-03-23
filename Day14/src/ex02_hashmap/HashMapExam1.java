package ex02_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam1 {
	
	public static void main(String[] args) {
		
		// Map ��ü ����
		Map<String, Integer> map = new HashMap<String, Integer>();	// �л� ���� ����
		
		// ��ü ����
		map.put("ȫ�浿", 90);
		map.put("�̸���", 80);
		map.put("���е�", 85);
		map.put("ȫ�浿", 95);
		map.put("������", 100);
		map.put("����", 70);
		System.out.println("����� ��Ʈ�� ����: " + map.size());
		
		// ���� ��ü ��ȸ
		System.out.println("ȫ�浿: " + map.get("ȫ�浿"));
		
		System.out.println("--------------");
		
		// Iterator�� ����� ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();	// ���� Ű ��ȸ
			Integer value = map.get(key);	// Ű�� ������ ��ȸ
			System.out.println(key + " : " + value);
		}
		
		System.out.println("--------------");
		
		
		
		System.out.println("--------------");
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("����� ��Ʈ�� ����: " + map.size());
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("����� ��Ʈ�� ����: " + map.size());
		
	}
	
}
