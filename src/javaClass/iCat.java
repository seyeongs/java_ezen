package javaClass;

public class iCat implements iAnimal{//클래스 implements 인터페이스 implements는 구현한다는 뜻

	@Override
	public void eat() {
		System.out.println("생선을 좋아합니다");
		
		
	}//인터페이스의 추상 메소드 재정의하여 구현
	
	
	
	
}
