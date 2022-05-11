package javaClass;

public class ClassA {
	int fieldA;
	public ClassA() {
		System.out.println("ClassA가 생성됨");
	}
	
	void methodA() {//메서드 안에 클래스
		class ClassD { //로컬 클래스
			int fieldD;
			
			public ClassD() {
				System.out.println("메서드 안에 있는 로컬 클래스 ClassD가 생성됨");
			}
			
			void methodD() {
				
			}
			
		}
		ClassD dd = new ClassD(); // 로컬 클래스는 해당 메서드 안에서만 유효
		dd.fieldD = 30;
		dd.methodD();
	}
	
	class ClassB{ //내부 인스턴스 클래스
		int fieldB;
		public ClassB() {
			System.out.println("ClassB가 생성됨");
			
		}
		
		void methodB() {
			fieldA = 10;
			methodA();
		}
	}
	
	static class ClassC{ //내부 정적 클래스
		int fieldC;
		static int field2C;
		
		public ClassC() {
			System.out.println("ClassC가 생성됨");
		}
		
		void methodC () {
			
		}
		static void method2C() {
			
		}
	}
}
