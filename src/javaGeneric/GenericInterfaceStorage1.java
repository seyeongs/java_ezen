package javaGeneric;

import java.util.List;

public class GenericInterfaceStorage1<T> implements GenericInterfaceStorage<T> {
	
	private T[] array;
	
	public GenericInterfaceStorage1(int capacity) {
		array = (T[])(new Object[capacity]); //�ϴ� ���� Ÿ���� �迭���� �𸣴ϱ� ������Ʈ�� �迭�� �迭 ���� ������ T[] �迭�� ĳ����
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
