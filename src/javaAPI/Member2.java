package javaAPI;

import java.util.Arrays;

public class Member2 implements Cloneable {
	//
	
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member2(String name,  int age, int[] scores, Car car) {
		this.age = age;
		this.car = car;
		this.name = name;
		this.scores = scores;
	}
	
	@Override //깊은 복제를 위한 재정의
	protected Object clone() throws CloneNotSupportedException {
		//얕은 복제 먼저
		Member2 cloned = (Member2) super.clone(); 
		
		//참조 타입 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //API메서드 사용
		cloned.car = new Car(this.car.model); //객체를 새로 생성해서 새로운 메모리 번지 참조
		return cloned;
//		
//		Member2 cloned = (Member2) clone();
		
//		cloned.scores =////////////////////////////////////////////////////////// 
	}
	
	public Member2 getMember() { 
		Member2 cloned = null;
		try { //clone()메서드는 try,catch문을 강제한다
			cloned=(Member2) clone();//object.clone()메소드는 cloned에 자기 복제후 
		}catch(CloneNotSupportedException e) {	
		}
		return cloned; //복제 리턴
	}
	
	
	@Override
	public String toString() {
		return "Member2 [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + ", car=" + car.model + "]";
	}


}
