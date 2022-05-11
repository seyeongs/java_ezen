package javaClass;

public class PhysicalInfo {
	//필드
	String name;
	int age;
	float height, weight;
	
	//생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;	
	}
	//메소드
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
		
	
	
}
