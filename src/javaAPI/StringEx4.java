package javaAPI;

public class StringEx4 {

	public static void main(String[] args) {
//		String str = "computer";
//		String sub1 = str.substring(5);
//		String sub2 = str.substring(2,5); // 2�� �ε������� 5�� �ε��� �������� ���
//		System.out.println(str.substring(5)); //�տ��� 5��° �ε��� ���� ��ȯ
		
//		String ssn = "920812-1234567";
//		ssn = ssn.substring(0,7) + "*******";///////////////////////////////////
//		System.out.println(ssn);
		
//		String ssn = "940923-1123000";
//		ssn = ssn.replace(ssn.substring(7), "*******");
//		System.out.println(ssn);
		
		String ssn = "940923-1200000";
		System.out.println(ssn.substring(7));
		ssn = ssn.replace(ssn.substring(7), "*");
		System.out.println(ssn);
	}

}
