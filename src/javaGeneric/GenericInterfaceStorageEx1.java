package javaGeneric;

public class GenericInterfaceStorageEx1 {

	public static void main(String[] args) {
		
		GenericInterfaceStorage<String> storage1 = new GenericInterfaceStorage1<String>(20);
		
		storage1.add("�ù����׸�", 0);
		storage1.add("��Ƴ�", 1);
		storage1.add("���ϵǸ�", 2);
		storage1.add("�� ����� ��", 3);
		
		for(int i=0; i<=3; i++) {
			System.out.println(storage1.get(i));	
		}
		
		
		
		

	}

}
