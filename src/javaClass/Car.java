package javaClass;

public class Car {
	Tire frontLeft = new Tire("�տ���", 7); //Ŭ���� �ʵ忡 Ŭ���� Ÿ�� ����
	Tire frontRight = new Tire("�տ�����", 3);
	Tire backLeft = new Tire("�ڿ���", 5);
	Tire backRight = new Tire("�ڿ�����", 5);
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�");
		if(frontLeft.roll()==false) {
			stop();
			return 1;
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(backLeft.roll() == false) {
			stop();
			return 3;
		}
		if(backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�");
	}
}
