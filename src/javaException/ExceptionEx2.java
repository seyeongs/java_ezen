package javaException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			String name = null;  
			System.out.println("�̸�: " + name.toString()); //toString()�޼ҵ�� ��ü�� ���������� �����´� ////�������� null�̶�� NullPointerException
		}catch(NullPointerException e) {
			System.out.println("��ü�� ���� null�Դϴ�");
		}
	}

}
