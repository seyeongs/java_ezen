package javaClass;

public class NestedClassEx2 {

	public static void main(String[] args) {
		ClassA.ClassC cc = new ClassA.ClassC();
		cc.fieldC =30;
		cc.methodC();
		ClassA.ClassC.field2C =20;//정적필드
		ClassA.ClassC.method2C();// 정적 메서드
				

	}

}
