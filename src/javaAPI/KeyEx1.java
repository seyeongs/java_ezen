package javaAPI;

import java.util.HashMap;

import javaClass.Account;

public class KeyEx1 {

	public static void main(String[] args) {
		HashMap<Key,String> hashMap = new HashMap<Key, String>();//key:value ������ ����
		hashMap.put(new Key(1), "��ö��"); //HashMap ��ü�� Ű ��� ����ֱ�
		hashMap.put(new Key(2), "ȫ�浿"); //
		String value = hashMap.get(new Key(1)); //Key Ŭ������ hashCode();�� �������ؼ� number �ʵ� ���� �ؽ��ڵ�� �̿�
		System.out.println(value);
		
//		int hash = new Key(1);
		Key kkk = new Key(123123);
		System.out.println(kkk);
		
//		HashMap<Key ,String> hashMap = new HashMap<Key, String>();
//		Key key1 = new Key(1);
//		Key key2 = new Key(2); 
////		hashMap.put(new Key(1), "������"); //hashMap�� Ű�� Key��ü�� �޸� ������ ����Ѵ� �͸� ��ü�� ������ �������� ������� ������ get�� ������ �� ����
////		hashMap.put(new Key(2), "ȫ�浿");
//		hashMap.put(key1, "������");
//		hashMap.put(key2, "ȫ�浿");
//		String value = hashMap.get(key1); //Key��ü�� �޸� �������� �����Ǿ� �ִ� key1�� Ű�� �Ѱ���� ������� ���������� ������ �� �ִ�
//		System.out.println(value);
//		value = hashMap.get(key2); //Key��ü�� �޸� �������� �����Ǿ� �ִ� key2
//		System.out.println(value);
		
		
	}

}
