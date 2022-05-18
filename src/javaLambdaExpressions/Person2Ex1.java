package javaLambdaExpressions;

public class Person2Ex1 {

	public static void main(String[] args) {
		Person2 person = (int age) -> {System.out.println("제 나이는 " + age + "살입니다");};
		person.info(29);
		
		Person2 person1 = (age) -> {System.out.println("제 나이는 " + age + "살입니다");};
		Person2 person2 = age -> System.out.println("제 나이는 " + age + "살입니다");
		
		person1.info(25);
		person2.info(20);
		
		
		
	}
}
