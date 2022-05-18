package javaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("java");
		set1.add("html");
		set1.add("css");
		set1.add("react");
		set1.add("java"); // 같은 값이 있으면 set영역에 저장 안 시킴
		System.out.println("총 자료 수 " + set1.size());
		
		//Set 데이터 가져오기
		Iterator<String> iter = set1.iterator();		
		while(iter.hasNext()) { //순서 없이 그냥 막 가져옴
			System.out.println(iter.next());
		}
		set1.remove("css");
	}

}
