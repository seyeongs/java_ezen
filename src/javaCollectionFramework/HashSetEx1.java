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
		set1.add("java"); // ���� ���� ������ set������ ���� �� ��Ŵ
		System.out.println("�� �ڷ� �� " + set1.size());
		
		//Set ������ ��������
		Iterator<String> iter = set1.iterator();		
		while(iter.hasNext()) { //���� ���� �׳� �� ������
			System.out.println(iter.next());
		}
		set1.remove("css");
	}

}
