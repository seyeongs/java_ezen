package javaCollectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<String> tree1 = new TreeSet<String>();
		tree1.add("bear");
		tree1.add("student");
		tree1.add("bababa");
		tree1.add("car");
		tree1.add("tree");
		tree1.add("fuck");
		tree1.add("java");
		tree1.add("tlqkf");
		System.out.println("b부터 f미만의 단어 검색");
		NavigableSet<String> rangeSet = tree1.subSet("b", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
		System.out.println();
		String sort;
		while(!tree1.isEmpty()) {
			sort = tree1.pollFirst();
			System.out.println(sort);
		}
				
		

	}

}
