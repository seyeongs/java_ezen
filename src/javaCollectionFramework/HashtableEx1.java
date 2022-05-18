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
			System.out.println("id 비번 입력해라");
			System.out.print("id:");
			String id = sc.next();
			System.out.print("비번:");
			String pword = sc.next();
			if (map1.containsKey(id)) {
				if(map1.get(id).equals(pword)) {
					System.out.println("로그인에 성공했");
					break;
				}else {
					System.out.println("비번이 일치하지 안흥ㅁ");
				}
				
			}else {
				System.out.println("존재하지 않는 아이디");
			}
		}
		
		
	
		

	}

}
