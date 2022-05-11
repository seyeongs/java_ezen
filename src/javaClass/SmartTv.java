package javaClass;

public class SmartTv implements RemoteControl, Searchable{ //�������̽��� ���� ������ �����ϴ�
	
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
		System.out.println("���� ����Ʈ TV���� : " + this.volume);
		
		
	}@Override
	public void trunOff() {
		System.out.println("����Ʈ Ƽ�� ���ϴ�");
		
	}@Override
	public void turnOn() {
		System.out.println("����Ʈ Ƽ�� �մϴ�");
		
	}@Override
	public void search(String url) {
		
			System.out.println(url + "�� �˻��մϴ�");
	}

}
