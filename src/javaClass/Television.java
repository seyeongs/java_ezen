package javaClass;

//RemoteControl �������̽��� ���� Ŭ����
public class Television implements RemoteControl{
	
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
		System.out.println("���� TV���� : " + this.volume);
		
		
	}@Override
	public void trunOff() {
		System.out.println("Ƽ�� ���ϴ�");
		
	}@Override
	public void turnOn() {
		System.out.println("Ƽ�� �մϴ�");
		
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("tv�� ����ó���մϴ�");
		}else {
			System.out.println("tv�� ���������մϴ�");
		}
	}
	
	
		
		
}
