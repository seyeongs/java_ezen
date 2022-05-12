package javaAPI;

public class MemberEx1 {

	public static void main(String[] args) {
		//얕은 복제
		Member origin = new Member("hong", "gil", "12345", 50, true);
		
		Member cloned = origin.getMember();
		
		cloned.password = "56789";
		
		//원복 객체 출력
		System.out.println("원본객체 "+origin.toString());
		
		//복제 객체 출력
		System.out.println("복제객체 "+cloned.toString()); //필드값이 복제되었음
		
		
		
	}

}
