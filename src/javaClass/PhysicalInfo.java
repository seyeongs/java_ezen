package javaClass;

public class PhysicalInfo {
	//�ʵ�
	String name;
	int age;
	float height, weight;
	
	//������
	public PhysicalInfo(String name, int age, float height, float weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;	
	}
	//�޼ҵ�
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
		
	
	
}
