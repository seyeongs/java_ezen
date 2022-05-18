package javaGeneric;

import java.util.List;

public class GenericInterfaceStorage1<T> implements GenericInterfaceStorage<T> {
	
	private T[] array;
	
	public GenericInterfaceStorage1(int capacity) {
		array = (T[])(new Object[capacity]); //일단 무슨 타입의 배열인지 모르니까 오브젝트로 배열로 배열 갯수 생성후 T[] 배열로 캐스팅
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		
		return array[index];
	}
}
