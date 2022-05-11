package javaClass;

public interface iAnimal { //컴파일 하면 클래스가 되기 때문에 이름 중복 주의!
	
	//인스턴트 필드를 만들 수 없다
	//상수는 쓸 수 있다 static final VRIABLE;
	//추상 메소드만 가질 수 있다 abstract void method(){}
	//java 8 이후 디폴트와 정적 메소드도 가능
	
	//메소드
	abstract void eat(); // 인터페이스에서는 메소드에 abstract 키워드를 써도 되고 안 써도 된다 어차피 추상임
	
	
	

}
