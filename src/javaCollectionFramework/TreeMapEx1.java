package javaCollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> mapList = new TreeMap<Integer, String>(); // Ű ���� �������� ������ ���� ���� �����Ѵ�
		mapList.put(5, "ȫ�浿");
		mapList.put(7, "��M��");
		mapList.put(10, "������");
		mapList.put(3, "����");
		mapList.put(8, "������"); 
		Map.Entry<Integer, String> entry = null;
		entry = mapList.firstEntry();
		System.out.println("���� ���� ��ȣ�� ��� " + entry.getKey() +"��" +entry.getValue());
		entry = mapList.lastEntry();
		System.out.println("���� ū ��ȣ�� ��� " + entry.getKey() +"��" +entry.getValue());
		
		
		while(!mapList.isEmpty()) {
			entry = mapList.pollFirstEntry();
			System.out.print(entry.getKey() +"��" +entry.getValue());
			System.out.println("**���� �ڷ�� : " + mapList.size());
		}

	}

}
