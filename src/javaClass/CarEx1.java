package javaClass;

public class CarEx1 {

	public static void main(String[] args) {
		Car jsMyCar = new Car();
		
		for(int i=1; i<=7; i++) {
			int problemLocation = jsMyCar.run();
			switch (problemLocation) {
			case 1:
				System.out.println("***�� ���� Ÿ�̾ü***");
				jsMyCar.frontLeft = new HankookTire("frontLeft", 10); //jsMyCar �ʵ忡 �ִ� Tire ������ TireŬ������ ����� HankookTire ��ü ���� // Ÿ����
				break;
			case 2:
				System.out.println("***�� ������ Ÿ�̾ü***");
				jsMyCar.frontRight = new KumhoTire("frontRight", 15);
				break;
			case 3:
				System.out.println("***�� ���� Ÿ�̾ü***");
				jsMyCar.backLeft = new HankookTire("backLeft", 11);
				break;
			case 4:
				System.out.println("***�� ������ Ÿ�̾ü***");
				jsMyCar.backRight = new KumhoTire("backRight", 12);
				break;
			}
			System.out.println("--------------------------------------");
			
			
		}
		
		

	}

}
