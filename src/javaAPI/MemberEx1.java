package javaAPI;

public class MemberEx1 {

	public static void main(String[] args) {
		//���� ����
		Member origin = new Member("hong", "gil", "12345", 50, true);
		
		Member cloned = origin.getMember();
		
		cloned.password = "56789";
		
		//���� ��ü ���
		System.out.println("������ü "+origin.toString());
		
		//���� ��ü ���
		System.out.println("������ü "+cloned.toString()); //�ʵ尪�� �����Ǿ���
		
		
		
	}

}
