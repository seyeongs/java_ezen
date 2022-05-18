package javaCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("정세영", 29);
		hashmap.put("엄복동", 32);
		hashmap.put("파이리", 44);
		hashmap.put("잠만보", 3000);
		hashmap.put("잠만보자기", 333000); //키 중복 x 밸류 중복 o
		System.out.println("총 자료의 수 : " + hashmap.size());
		System.out.println(hashmap.get("정세영"));
		
		Set<String> keySet = hashmap.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = hashmap.get(key);
			System.out.println(key +":" + value);
		}
		hashmap.remove("정세영");
		/////////////////////////////////////////////////////이런 병신 같은 걸 실제로 누가 쓰긴하나
		Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
		Iterator<Map.Entry<String, Integer>> iter1 = entrySet.iterator();
		while(iter1.hasNext()) {
			Map.Entry<String, Integer> entry = iter1.next();
			String key1 = entry.getKey();
			Integer value1 = entry.getValue();
			System.out.println(key1 +":" + value1);
		}
		
	}

}
