package javaClass;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "��ȣ Ÿ�̾��� ����: " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "��ȣ Ÿ�̾� ��ũ");
			return false;
		}	
	}
	
}

