package javaAPI;

public class Member3Ex1 {

	public static void main(String[] args) {
		Member3 member3 = new Member3("blue", "이파란");
		System.out.println(member3);//toString()이 자동으로 호출된다
		
		Class class1 = member3.getClass();
		System.out.println(class1.getName());

	}

}
