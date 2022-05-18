package javaCollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> mapList = new TreeMap<Integer, String>(); // 키 값을 기준으로 오른쪽 왼쪽 노드로 저장한다
		mapList.put(5, "홍길동");
		mapList.put(7, "김첤후");
		mapList.put(10, "이이이");
		mapList.put(3, "오목교");
		mapList.put(8, "박찬비"); 
		Map.Entry<Integer, String> entry = null;
		entry = mapList.firstEntry();
		System.out.println("가장 낮은 번호의 사람 " + entry.getKey() +"ㅁ" +entry.getValue());
		entry = mapList.lastEntry();
		System.out.println("가장 큰 번호의 사람 " + entry.getKey() +"ㅁ" +entry.getValue());
		
		
		while(!mapList.isEmpty()) {
			entry = mapList.pollFirstEntry();
			System.out.print(entry.getKey() +"ㅁ" +entry.getValue());
			System.out.println("**남은 자료수 : " + mapList.size());
		}

	}

}
