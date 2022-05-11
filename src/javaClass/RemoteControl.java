package javaClass;

//������ �������̽�
public interface RemoteControl {
	//���
	public static final int MAX_VOLUME = 10; //static final �ᵵ �ǰ� �Ƚᵵ ��
	public static final int MIN_VOLUME = 0; //static final �ᵵ �ǰ� �Ƚᵵ ��
	
	//�߻� �޼ҵ�
	abstract void turnOn(); //abstract�� �ᵵ �ǰ� �Ƚᵵ �ǰ�
	abstract void trunOff();
	abstract void setVolume(int volume);
	
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}else {
			System.out.println("���� �����մϴ�");
		}
	}
	
	
	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� �������� ��ȯ�մϴ�");
	}
}
