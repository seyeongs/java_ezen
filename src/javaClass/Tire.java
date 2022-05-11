package javaClass;

public class Tire {
	public int maxRotation; //다이어 수명
	public int accumulatedRotation; // 누적 회전수
	public String location; //타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	
	public boolean roll() {
		
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 타이어의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "타이어 펑크");
			return false;
		}	
	}
}
