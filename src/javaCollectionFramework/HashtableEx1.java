package javaCollectionFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx1 {

	public static void main(String[] args) {
		Map<String, String> map1 = new Hashtable<String, String>();
		map1.put("1", "fuckJAVA");
		map1.put("2", "fdfuckJAVA");
		map1.put("3", "fucksdJAVA");
		map1.put("4", "fzxcuckJAVA");
		map1.put("5", "fuckJAVzxcA");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id ��� �Է��ض�");
			System.out.print("id:");
			String id = sc.next();
			System.out.print("���:");
			String pword = sc.next();
			if (map1.containsKey(id)) {
				if(map1.get(id).equals(pword)) {
					System.out.println("�α��ο� ������");
					break;
				}else {
					System.out.println("����� ��ġ���� ���櫓");
				}
				
			}else {
				System.out.println("�������� �ʴ� ���̵�");
			}
		}
		
		
	
		

	}

}
