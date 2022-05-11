package javaClass;

public class iTiger extends Animal implements iAnimal{ //다중 상속은 안되지만 상속과 구현은 함께 할 수 있다.
	
	@Override
	void move() {
		System.out.println("네발로 이동합니다");
		
	}//Animal 추상클래스가 가진 추상 메소드
	
	@Override
	public void eat() {
		System.out.println("맷돼지를 잡아먹습니다");
		
	}//iAnimal 인터페이스가 가진 추상 메소드
		
	
}
