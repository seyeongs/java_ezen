package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {
		String original = "Java Programming";
		
		String lower = original.toLowerCase();//////////////////////////////////////////////
		System.out.println(lower);
		
		String upper = original.toUpperCase();///////////////////////////////////////////
		System.out.println(upper);
		
		String str = "   �ڹ� ���α׷���     ";
		String newStr = str.trim(); //���ڿ� �¿� ���� �ִ� ������ �������ش�////////////////////////////////////
		System.out.println(newStr);
		
		String str2 = String.valueOf(10); //���ڿ��� �����ش�////////////////////////////////////////
		String str3 = String.valueOf(30);
		System.out.println(str2+str3);
		
		
	}

}
