package javaAPI;

public class StringEx2 {

	public static void main(String[] args) {
//		String str = "�ڹ� ���α׷���";
//		int index = str.indexOf("�ڹ�"); //���ڿ� �� ã���� �ϴ� ���ڿ� ��ġ�ϴ� ù ��° ������ �ε����� �����Ѵ�, -1�� ����////////////////////
//		System.out.println(index);
//		System.out.println(str.length()); //�ε����� �ƴ϶� ���ڼ��� ��ȯ//////////////////////////////////
//		if(index != -1) {
//			System.out.println("�ڹٿ� ���� ����Դϴ�");
//		}else {
//			System.out.println("�ڹ� ��⸸ �ϼ���");
//		}
		
		
//		String str = "�ڹ� ���α׷���";
//		int index = str.indexOf("�ڹ�");
//		System.out.println(index);
//		
//		System.out.println(str.length());
//		
//		if(index != -1) {
//			System.out.println("ã�� ���ڰ� " + index +"�� ���ڿ� �ε��� ���� �ֽ��ϴ�");
//		}else {
//			System.out.println("ã�� ���ڰ� �����ϴ�");
//		}
		
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("�ڹ�");
		System.out.println(index);
		
		System.out.println(str.length());
		
		if(index != -1) {
			System.out.println("ã�� ���ڰ� " +index+ "�� �ε��� ���� �ֽ��ϴ�");
		}else {
			System.out.println("ã�� ���ڰ� ���ڿ��� �����ϴ�");
		}
		
	}

}