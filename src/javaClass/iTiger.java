package javaClass;

public class iTiger extends Animal implements iAnimal{ //���� ����� �ȵ����� ��Ӱ� ������ �Բ� �� �� �ִ�.
	
	@Override
	void move() {
		System.out.println("�׹߷� �̵��մϴ�");
		
	}//Animal �߻�Ŭ������ ���� �߻� �޼ҵ�
	
	@Override
	public void eat() {
		System.out.println("�˵����� ��ƸԽ��ϴ�");
		
	}//iAnimal �������̽��� ���� �߻� �޼ҵ�
		
	
}
