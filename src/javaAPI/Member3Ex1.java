package javaAPI;

public class Member3Ex1 {

	public static void main(String[] args) {
		Member3 member3 = new Member3("blue", "���Ķ�");
		System.out.println(member3);//toString()�� �ڵ����� ȣ��ȴ�
		
		Class class1 = member3.getClass();
		System.out.println(class1.getName());

	}

}
