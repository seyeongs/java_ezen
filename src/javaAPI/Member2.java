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
	
	@Override //���� ������ ���� ������
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ����
		Member2 cloned = (Member2) super.clone(); 
		
		//���� Ÿ�� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //API�޼��� ���
		cloned.car = new Car(this.car.model); //��ü�� ���� �����ؼ� ���ο� �޸� ���� ����
		return cloned;
//		
//		Member2 cloned = (Member2) clone();
		
//		cloned.scores =////////////////////////////////////////////////////////// 
	}
	
	public Member2 getMember() { 
		Member2 cloned = null;
		try { //clone()�޼���� try,catch���� �����Ѵ�
			cloned=(Member2) clone();//object.clone()�޼ҵ�� cloned�� �ڱ� ������ 
		}catch(CloneNotSupportedException e) {	
		}
		return cloned; //���� ����
	}
	
	
	@Override
	public String toString() {
		return "Member2 [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + ", car=" + car.model + "]";
	}


}
