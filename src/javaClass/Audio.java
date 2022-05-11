package javaClass;

//RemoteControl �������̽��� ���� Ŭ����

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
		System.out.println("���� Audio���� : " + this.volume);
		
		
	}@Override
	public void trunOff() {
		System.out.println("Audio�� ���ϴ�");
		
	}@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
		
	}@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("audio�� ����ó���մϴ�");
		}else {
			System.out.println("audio�� ���������մϴ�");
		}
	}
	
}
