package javaClass;

public class NestedClassEx2 {

	public static void main(String[] args) {
		ClassA.ClassC cc = new ClassA.ClassC();
		cc.fieldC =30;
		cc.methodC();
		ClassA.ClassC.field2C =20;//�����ʵ�
		ClassA.ClassC.method2C();// ���� �޼���
				

	}

}
