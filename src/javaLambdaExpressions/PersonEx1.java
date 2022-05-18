package javaLambdaExpressions;

public class PersonEx1 {

	public static void main(String[] args) {
		
		Person person1 = new Person() {
			
			@Override
			public void info() {
				System.out.println("집이 없는 홍길동이오");
			}
		};
		person1.info();
		////////////////////////////////////////////////////////////////////////////////////////
		//람다식 //함수적 스타일 //람다식은 구현하려는 인터페이스에 추상 메소드가 하나만 있을 때 사용이 가능하다 
		Person person2 = () -> {
			System.out.println("나는 개인이오");
		};
		person2.info();
		
		//구현 코드가 한 줄 밖에 없으면 중괄호 생랼가능
		Person person3 = () ->System.out.println("나는 바위요");
		person3.info();
		
		
		
	}

}
