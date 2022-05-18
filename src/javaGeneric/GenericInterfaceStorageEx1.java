package javaGeneric;

public class GenericInterfaceStorageEx1 {

	public static void main(String[] args) {
		
		GenericInterfaceStorage<String> storage1 = new GenericInterfaceStorage1<String>(20);
		
		storage1.add("시벌제네릭", 0);
		storage1.add("어렵네", 1);
		storage1.add("내일되면", 2);
		storage1.add("다 까먹을 각", 3);
		
		for(int i=0; i<=3; i++) {
			System.out.println(storage1.get(i));	
		}
		
		
		
		

	}

}
