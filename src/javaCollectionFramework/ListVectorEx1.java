package javaCollectionFramework;

import java.util.List;
import java.util.Vector;

public class ListVectorEx1 {

	public static void main(String[] args) {
		List<ListVectorBoard> board = new Vector<ListVectorBoard>();
		board.add(new ListVectorBoard("코로나", "코로로로나 굿", "길럼"));
		board.add(new ListVectorBoard("자바활용", "시험 변수~참조", "이젠"));
		board.add(new ListVectorBoard("자바 구현 수업", "안드로이드 앱 만들기", "이젠"));
		
		for(int i=0; i<board.size(); i++) {
			ListVectorBoard obj = board.get(i);
			System.out.println(obj.toString());
		}

	}

}
