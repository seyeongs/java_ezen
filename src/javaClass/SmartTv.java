package javaClass;

public class SmartTv implements RemoteControl, Searchable{ //인터페이스는 다중 구현이 가능하다
	
	private int volume;
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV볼륨 : " + this.volume);
		
		
	}@Override
	public void trunOff() {
		System.out.println("스마트 티비를 끕니다");
		
	}@Override
	public void turnOn() {
		System.out.println("스마트 티비를 켭니다");
		
	}@Override
	public void search(String url) {
		
			System.out.println(url + "을 검색합니다");
	}

}
