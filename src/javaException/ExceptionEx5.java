package javaException;

//finally, ���� catch 
public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
			
			String[] data = {"100", "a200"};
			int value1 = Integer.parseInt(data[0]);
			int value2 = Integer.parseInt(data[2]);
			int result = value1+value2;
			System.out.println("��� ���: " + result);
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �� �� �����ϴ�");	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε����� �ʰ��߽��ϴ�");
		}catch(Exception e) { //��� ���� ó��
			System.out.println("���α׷� �����ڿ��� �����ϼ��� 010-0000-0000" + e.getMessage());
		}finally { //���� �߻� ������ ���� ���� ������ ����
			System.out.println("ȭ����");
		}

	}

}
