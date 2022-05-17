package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <>안에 타입을 지정하면 해당 타입의 자료만 넣을 수 있다, Integer, Float, String ...
		
		list.add("dkdkdk");
		
		String str = list.get(0); //제네릭을 지정했을 경우 캐스팅을 하지 않아도 된다
		
		System.out.println(str);
		list.add("dkdkdk"); 
		list.add("dkdkdkd");
		list.add("dkdkdka");
		list.add(1, "dkdkdka");// 인덱스를 지정할 수 있다, 덮어쓰기가 아니라 insert(삽입)로 들어감
		
		list.remove(2); //2번 인덱스에 3번 3번은 4번으로 인덱스가 댕겨진다
		for(String strr : list) {
			System.out.println(strr);
		} //제네릭으로 타입을 지정하면 향상된 for문도 사용 가능하다
		

	}

}
