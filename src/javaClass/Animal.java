package javaClass;

public abstract class Animal { //abstract 키워드
	String name;	
	//추상클래스는 생성자가 있지만 new연산자를 통해 객체를 만들지 못한다
	abstract void move(); //추상 메소는 {}가 없다
}
