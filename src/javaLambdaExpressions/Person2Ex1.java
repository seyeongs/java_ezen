package javaLambdaExpressions;

public class Person2Ex1 {

	public static void main(String[] args) {
		Person2 person = (int age) -> {System.out.println("�� ���̴� " + age + "���Դϴ�");};
		person.info(29);
		
		Person2 person1 = (age) -> {System.out.println("�� ���̴� " + age + "���Դϴ�");};
		Person2 person2 = age -> System.out.println("�� ���̴� " + age + "���Դϴ�");
		
		person1.info(25);
		person2.info(20);
		
		
		
	}
}
