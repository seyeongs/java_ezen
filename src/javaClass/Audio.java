package javaClass;

//RemoteControl 인터페이스의 구현 클래스

public class Audio implements RemoteControl{
	
	private int volume;
	private boolean mute;
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨 : " + this.volume);
		
		
	}@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다");
		
	}@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("audio를 무음처리합니다");
		}else {
			System.out.println("audio를 무음해제합니다");
		}
	}
	
}
