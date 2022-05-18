package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListArrayListEx1 {

	public static void main(String[] args) {
		
		
		String[] subjects = new String[5];
		subjects[0] = "java";
		subjects[1] = "html";
		subjects[2] = "css";
		subjects[3] = "js";
		subjects[4] = "react";
		
		System.out.println("ÃÑ °ú¸ñ ¼ö" + subjects.length);
		for(String subject : subjects) {
			System.out.println(subject);
		}
		
		System.out.println();
		
		List<String> subjects2 = new ArrayList<String>();
		
		subjects2.add("java");
		subjects2.add("html");
		subjects2.add("css");
		subjects2.add("js");
		subjects2.add("react");
		System.out.println("ÃÑ °ú¸ñ ¼ö" + subjects2.size());
		for(String subject : subjects2) {
			System.out.println(subject);
		}
		System.out.println();
		
		subjects2.remove(1);
		for(String subject : subjects2) {
			System.out.println(subject);
		}
		System.out.println();
		
		subjects2.add(1, "html");
		for(String subject : subjects2) {
			System.out.println(subject);
		}
	}

}
