package javaGeneric;

public class GenericBox<T> { //���׸� Ÿ�� �ۼ�
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
