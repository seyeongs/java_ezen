package javaAPI;

import java.util.HashMap;

public class StudentEx1 {

	public static void main(String[] args) {
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);

	}

}
