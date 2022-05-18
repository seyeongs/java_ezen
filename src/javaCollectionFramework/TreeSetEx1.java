package javaCollectionFramework;

import java.util.TreeSet;

public class TreeSetEx1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>(); //검색강화 컬렉션 // 빠른 검색을 위해 만들어졌다// left|value|right <-이런 노드객체 구조임 
		scores.add(70);
		scores.add(95);
		scores.add(62);
		scores.add(88);
		scores.add(80);
		scores.add(67);
		scores.add(98);
		
		System.out.println("가장 높은 점수 :" + scores.last()); //오른쪽 끝
		System.out.println("가장 낮은 점수 :" + scores.first());//왼쪽 끝
		System.out.println("88 아래 점수 :" + scores.lower(88)); //88기준 왼쪽
		System.out.println("88 위 점수 :" + scores.higher(88)); //88기준 오른쪽
		
		int jumsu;
		
		while(!scores.isEmpty()) {
			jumsu = scores.pollFirst(); //가장 낮은 수 꺼내기
			System.out.println("꺼낸 점수 : " + jumsu);
			System.out.println("남은 거 : " + scores.size());
			
		}
		

	}

}
