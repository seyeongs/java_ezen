package javaClass;

//리모컨 인터페이스
public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10; //static final 써도 되고 안써도 됨
	public static final int MIN_VOLUME = 0; //static final 써도 되고 안써도 됨
	
	//추상 메소드
	abstract void turnOn(); //abstract도 써도 되고 안써도 되고
	abstract void trunOff();
	abstract void setVolume(int volume);
	
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	
	
	// 정적 메소드
	static void changeBattery() {
		System.out.println("리모컨의 건전지를 교환합니다");
	}
}
