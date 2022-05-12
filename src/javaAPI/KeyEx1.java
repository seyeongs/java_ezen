package javaAPI;

import java.util.HashMap;

import javaClass.Account;

public class KeyEx1 {

	public static void main(String[] args) {
		HashMap<Key,String> hashMap = new HashMap<Key, String>();//key:value 형식의 구조
		hashMap.put(new Key(1), "김철수"); //HashMap 객체에 키 밸류 집어넣기
		hashMap.put(new Key(2), "홍길동"); //
		String value = hashMap.get(new Key(1)); //Key 클래스의 hashCode();를 재정의해서 number 필드 값을 해쉬코드로 이용
		System.out.println(value);
		
//		int hash = new Key(1);
		Key kkk = new Key(123123);
		System.out.println(kkk);
		
//		HashMap<Key ,String> hashMap = new HashMap<Key, String>();
//		Key key1 = new Key(1);
//		Key key2 = new Key(2); 
////		hashMap.put(new Key(1), "정세영"); //hashMap의 키는 Key객체의 메모리 번지를 사용한다 익명 객체는 생성후 번지값이 비어지기 때문에 get을 수행할 수 없다
////		hashMap.put(new Key(2), "홍길동");
//		hashMap.put(key1, "정세영");
//		hashMap.put(key2, "홍길동");
//		String value = hashMap.get(key1); //Key객체의 메모리 번지값이 참조되어 있는 key1를 키로 넘겨줘야 밸류값을 정상적으로 가져올 수 있다
//		System.out.println(value);
//		value = hashMap.get(key2); //Key객체의 메모리 번지값이 참조되어 있는 key2
//		System.out.println(value);
		
		
	}

}
