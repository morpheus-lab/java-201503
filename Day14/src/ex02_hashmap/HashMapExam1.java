package ex02_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam1 {
	
	public static void main(String[] args) {
		
		// Map 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();	// 학생 성적 저장
		
		// 객체 저장
		map.put("홍길동", 90);
		map.put("이몽룡", 80);
		map.put("변학도", 85);
		map.put("홍길동", 95);
		map.put("성춘향", 100);
		map.put("콩쥐", 70);
		System.out.println("저장된 엔트리 개수: " + map.size());
		
		// 저장 객체 조회
		System.out.println("홍길동: " + map.get("홍길동"));
		
		System.out.println("--------------");
		
		// Iterator로 저장된 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();	// 다음 키 조회
			Integer value = map.get(key);	// 키로 데이터 조회
			System.out.println(key + " : " + value);
		}
		
		System.out.println("--------------");
		
		
		
		System.out.println("--------------");
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("저장된 엔트리 개수: " + map.size());
		
		// 전체 객체 삭제
		map.clear();
		System.out.println("저장된 엔트리 개수: " + map.size());
		
	}
	
}
