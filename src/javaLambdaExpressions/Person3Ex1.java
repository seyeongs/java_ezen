package javaLambdaExpressions;

public class Person3Ex1 {
	
	public static void main(String[] args) {
		Person3 person2 = year -> {return 2022-(year+1900);};
		Person3 person = year -> 2022-(year+1900); //return ���� ����
		
		System.out.println(person2.info(95));
		System.out.println(person.info(94));

	}

}
