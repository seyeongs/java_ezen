package javaClass;

public class ClassA {
	int fieldA;
	public ClassA() {
		System.out.println("ClassA�� ������");
	}
	
	void methodA() {//�޼��� �ȿ� Ŭ����
		class ClassD { //���� Ŭ����
			int fieldD;
			
			public ClassD() {
				System.out.println("�޼��� �ȿ� �ִ� ���� Ŭ���� ClassD�� ������");
			}
			
			void methodD() {
				
			}
			
		}
		ClassD dd = new ClassD(); // ���� Ŭ������ �ش� �޼��� �ȿ����� ��ȿ
		dd.fieldD = 30;
		dd.methodD();
	}
	
	class ClassB{ //���� �ν��Ͻ� Ŭ����
		int fieldB;
		public ClassB() {
			System.out.println("ClassB�� ������");
			
		}
		
		void methodB() {
			fieldA = 10;
			methodA();
		}
	}
	
	static class ClassC{ //���� ���� Ŭ����
		int fieldC;
		static int field2C;
		
		public ClassC() {
			System.out.println("ClassC�� ������");
		}
		
		void methodC () {
			
		}
		static void method2C() {
			
		}
	}
}
