package javaGeneric;

public class GenericBox<T> { //제네릭 타입 작성
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
