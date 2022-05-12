package javaAPI;

public class Member implements Cloneable{ // ������ �� �ִٴ� ǥ��
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean isAdult;
	
	public Member(String id, String name, String password, int age, boolean isAdult) {
		this.age = age;
		this.id = id;
		this.name = name;
		this.password = password;
		this.isAdult = isAdult;
	}

	public Member getMember() { 
		Member cloned = null;
		try { //clone()�޼���� try,catch���� �����Ѵ�
			cloned=(Member) clone();//object.clone()�޼ҵ�� cloned�� �ڱ� ������ 
		}catch(CloneNotSupportedException e) {	
		}
		return cloned; //���� ����
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", isAdult="
				+ isAdult + "]";
	}
	
	
}

//@Override // 
//protected Object clone() throws CloneNotSupportedException {
//	// TODO Auto-generated method stub
//	return super.clone();
//}
// ObjectŬ������ �ִ� clone() �޼���� ���ϰ��� Object�̴� ���� �������̵� ���� �ʰ� �ڽ� Ŭ�������� ȣ���� ��� ���� ���� ���� ���� ĳ������ ����� �Ѵ�.
