package javaClass;
//중첩 클래스 활용 예제
public class NestedClassEx1 {

	public static void main(String[] args) {
		ClassA aa = new ClassA(); //인스턴스 객체 생성
		aa.fieldA = 30;
		aa.methodA();
		ClassA.ClassB bb = aa.new ClassB(); // 인스턴스 내부 클래스 생성
		bb.fieldB = 50;
		bb.methodB();
		
	}

}
