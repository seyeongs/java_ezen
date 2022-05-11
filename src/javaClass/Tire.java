package javaClass;

public class Tire {
	public int maxRotation; //���̾� ����
	public int accumulatedRotation; // ���� ȸ����
	public String location; //Ÿ�̾� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	
	public boolean roll() {
		
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Ÿ�̾��� ����: " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "Ÿ�̾� ��ũ");
			return false;
		}	
	}
}
