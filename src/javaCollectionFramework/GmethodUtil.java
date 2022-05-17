package javaCollectionFramework;

public class GmethodUtil {
	//제네릭 메서드
	public static <T> GenericBox<T> boxing(T t){
		GenericBox<T> box = new GenericBox<T>();
		box.set(t);
		return box;
	}
}
