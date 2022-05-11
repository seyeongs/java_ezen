package javaClass;

public class AnimalEx1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Egle egle = new Egle();
		
		tiger.name = "호돌이";
		tiger.age = 5;
		
		egle.name = "아메리카";
		egle.home = "오하이오주";
		
		System.out.println(tiger.name + "는 " + tiger.age + "살입니다");
		tiger.move();
		System.out.println(egle.name + "는 " + egle.home + "에 살고 있습니다");
		egle.move();

	}

}
