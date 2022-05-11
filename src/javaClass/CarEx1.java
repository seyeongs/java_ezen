package javaClass;

public class CarEx1 {

	public static void main(String[] args) {
		Car jsMyCar = new Car();
		
		for(int i=1; i<=7; i++) {
			int problemLocation = jsMyCar.run();
			switch (problemLocation) {
			case 1:
				System.out.println("***앞 왼쪽 타이어교체***");
				jsMyCar.frontLeft = new HankookTire("frontLeft", 10); //jsMyCar 필드에 있는 Tire 변수에 Tire클래스를 상속한 HankookTire 객체 생성 // 타형성
				break;
			case 2:
				System.out.println("***앞 오른쪽 타이어교체***");
				jsMyCar.frontRight = new KumhoTire("frontRight", 15);
				break;
			case 3:
				System.out.println("***뒤 왼쪽 타이어교체***");
				jsMyCar.backLeft = new HankookTire("backLeft", 11);
				break;
			case 4:
				System.out.println("***뒤 오른쪽 타이어교체***");
				jsMyCar.backRight = new KumhoTire("backRight", 12);
				break;
			}
			System.out.println("--------------------------------------");
			
			
		}
		
		

	}

}
