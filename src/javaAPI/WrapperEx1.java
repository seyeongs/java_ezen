package javaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		//Wrapper(����)Ŭ����
		Integer obj1 = new Integer(10); //��Ҽ� = ���� Ÿ�� ��� java5 �� 
		Integer obj2 = 20; //�ڵ� Boxing //java5���� �߰��� ���
		//�⺻Ÿ�������� ����Ÿ��ó�� �ּ� ���� ã�ư��� �����ϴ� ���� �ִ� ������ ����
		System.out.println(obj2.intValue());
		int value = obj1; //�⺻Ÿ�Կ� ��ü�� �����ص� �ڵ� Unboxing�� ���ֱ� ������ ������ ���� �ʴ´�
		System.out.println(value);
		
		String str1 = "20";
		String str2 = "2.54";
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		
	}

}
