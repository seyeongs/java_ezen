package javaCollectionFramework;

public class GenericEx2 {

	public static void main(String[] args) {
		//���׸��� �� �� ���
//		GenericBox gBox = new GenericBox();
//		
//		gBox.set("ȫ�浿");
//		String str = (String)gBox.get(); //ObjectŸ���� ��ȯ�ϱ� ������ String���� Ÿ�Ժ�ȯ�� ������Ѵ�
//		gBox.set(new GenericApple());
//		GenericApple apple = (GenericApple)gBox.get(); //��������
		GenericBox<String> gBox1 = new GenericBox<String>();
		
		gBox1.set("������");
		String name = gBox1.get();
		
		
		GenericBox<GenericApple> gBox2 = new GenericBox<GenericApple>();
		
		gBox2.set(new GenericApple());
		GenericApple apple = gBox2.get();
		

	}

}
