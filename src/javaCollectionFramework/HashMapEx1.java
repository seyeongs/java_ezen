package javaCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("������", 29);
		hashmap.put("������", 32);
		hashmap.put("���̸�", 44);
		hashmap.put("�Ḹ��", 3000);
		hashmap.put("�Ḹ���ڱ�", 333000); //Ű �ߺ� x ��� �ߺ� o
		System.out.println("�� �ڷ��� �� : " + hashmap.size());
		System.out.println(hashmap.get("������"));
		
		Set<String> keySet = hashmap.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = hashmap.get(key);
			System.out.println(key +":" + value);
		}
		hashmap.remove("������");
		/////////////////////////////////////////////////////�̷� ���� ���� �� ������ ���� �����ϳ�
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
