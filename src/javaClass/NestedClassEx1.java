package javaClass;
//��ø Ŭ���� Ȱ�� ����
public class NestedClassEx1 {

	public static void main(String[] args) {
		ClassA aa = new ClassA(); //�ν��Ͻ� ��ü ����
		aa.fieldA = 30;
		aa.methodA();
		ClassA.ClassB bb = aa.new ClassB(); // �ν��Ͻ� ���� Ŭ���� ����
		bb.fieldB = 50;
		bb.methodB();
		
	}

}
