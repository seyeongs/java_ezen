package javaLambdaExpressions;

public class PersonEx1 {

	public static void main(String[] args) {
		
		Person person1 = new Person() {
			
			@Override
			public void info() {
				System.out.println("���� ���� ȫ�浿�̿�");
			}
		};
		person1.info();
		////////////////////////////////////////////////////////////////////////////////////////
		//���ٽ� //�Լ��� ��Ÿ�� //���ٽ��� �����Ϸ��� �������̽��� �߻� �޼ҵ尡 �ϳ��� ���� �� ����� �����ϴ� 
		Person person2 = () -> {
			System.out.println("���� �����̿�");
		};
		person2.info();
		
		//���� �ڵ尡 �� �� �ۿ� ������ �߰�ȣ ���U����
		Person person3 = () ->System.out.println("���� ������");
		person3.info();
		
		
		
	}

}
