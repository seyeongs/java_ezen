package javaClass;

public class RemoteControlEx1 {

	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.trunOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.trunOff();
		
		
	}

}
