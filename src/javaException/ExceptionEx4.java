package javaException;

public class ExceptionEx4 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a200";
		try {
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(data1+data2);			
		}catch(NumberFormatException e) {
			System.out.println("������ ��ȯ�� �� ���� ���ڿ��Դϴ�");
		}
				

	}

}
