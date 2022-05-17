package javaCollectionFramework;

public class GmethodUtilEx1 {

	public static void main(String[] args) {
		GenericBox<Integer> box1 = GmethodUtil.boxing(50);
		int value = box1.get();
		System.out.println(value);
		
		GenericBox<String> box2 = GmethodUtil.boxing("¾î·Á¿ø");
		String str = box2.get();
		System.out.println(str);

	}

}
