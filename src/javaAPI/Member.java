package javaAPI;

public class Member implements Cloneable{ // 복제할 수 있다는 표시
	
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
		try { //clone()메서드는 try,catch문을 강제한다
			cloned=(Member) clone();//object.clone()메소드는 cloned에 자기 복제후 
		}catch(CloneNotSupportedException e) {	
		}
		return cloned; //복제 리턴
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
// Object클래스에 있는 clone() 메서드는 리턴값이 Object이다 따라서 오버라이드 하지 않고 자식 클래스에서 호출할 경우 리턴 값에 대한 강제 캐스팅을 해줘야 한다.
