package javaClass;

public class AnimalEx1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Egle egle = new Egle();
		
		tiger.name = "ȣ����";
		tiger.age = 5;
		
		egle.name = "�Ƹ޸�ī";
		egle.home = "�����̿���";
		
		System.out.println(tiger.name + "�� " + tiger.age + "���Դϴ�");
		tiger.move();
		System.out.println(egle.name + "�� " + egle.home + "�� ��� �ֽ��ϴ�");
		egle.move();

	}

}
