package javaClass;

public class Egle extends Animal {
	String home;
	
	@Override //추상 메소드 오바라이드해서 사용
	void move() {
		System.out.println("날개로 이동합니다");
	}
	
	
}
