package javaClass;

public class AnonymousEx1 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.method1(anony.pField);
		anony.method1(new Person() {
			void study() {
				System.out.println("공부합니다");
			}
			
			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("dldldldldldlddll");
				study();
			}
		});
		anony.method2();
	}

}
