package javaClass;
//������ ������̼� ���� Ŭ����
public class Service {
	
	@PrintAnotation
	public void corona() {
		System.out.println("�ڷγ� �ڸ�");
	}
	
	@PrintAnotation("*")
	public void corona2() {
		System.out.println("����ũ�� �ڸ�");
	}
	
	@PrintAnotation(value = "$", number = 30)
	public void corona3() {
		System.out.println("�ڷγ� ��Ÿ �ڸ�");
	}
}
