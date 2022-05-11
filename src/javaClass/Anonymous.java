package javaClass;

public class Anonymous {
	//필드값으로 클래스 대입
	Person pField = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};
	
	
	void method1(Person person) {
		person.wake();
	}
	
	void method2() {
		//로컬 변수로 객체 대입
		Person localPerson = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("5시 기상");
				walk();
			}
		};
		
		localPerson.wake();
		
	}
	
	
}
