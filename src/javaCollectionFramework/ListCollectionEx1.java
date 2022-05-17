package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

//List인터페이스의 구현 클래스 => ArrayList, Vector, LinkedList
public class ListCollectionEx1 {
	public static void main(String[] args) {
		List list = new ArrayList(); //구현 클래스는 이미 있다
		list.add("홍길동");
		list.add(10);
		list.add(2.4);
		list.add(false);
		//다양한 타입의 자료형을 넣을 수 있다
		for(int i =0; i<list.size(); i++) { //size()는 엘리멘트 갯수를 0부터 세서 가져다 준다
			System.out.println(list.get(i));
		}
	}

}
//동적 배열의 단점 : String str = list.get(0); <= 불가능하다
//				 String str = (String)list.get(0); <= 꼭 캐스팅을 해줘야 한다 그래서 필요한게 제네릭
// 제네릭 => 타입을 파라미터로 가지는 클래스, 인터페이스를 말한다