package javaCollectionFramework;

public class GmethodUtil {
	//���׸� �޼���
	public static <T> GenericBox<T> boxing(T t){
		GenericBox<T> box = new GenericBox<T>();
		box.set(t);
		return box;
	}
}
