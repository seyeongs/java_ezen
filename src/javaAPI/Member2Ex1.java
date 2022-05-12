package javaAPI;

public class Member2Ex1 {

	public static void main(String[] args) {
		Member2 origin = new Member2("hoh", 20, new int[] {10,20,30}, new Car("테슬라"));
		
		Member2 cloned = origin.getMember();
		
		cloned.scores[1] = 90;
		cloned.car.model = "차슬라";
		System.out.println(origin.toString()); 
		System.out.println(cloned.toString()); 
		//origin 필드의 Car, scores배열은 참조 타입이기 때문에 복제된 객체의 필드에도 같은 메모리 번지가 복제된다. 
		//따라서 복제 객체에서 참조 타입의 필드를 값을 수정하면 원본에도 수정이 된다
		//그러므로 참조타입은 얕은 복제가 아닌 깊은 복제를 해야한다
		
		
	}
}
