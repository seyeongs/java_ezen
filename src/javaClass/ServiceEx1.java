package javaClass;

import java.lang.reflect.Method;

public class ServiceEx1 {

	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods(); // ���� Ŭ������ ���ǵ� �޼ҵ� ������ �޼ҵ� Ÿ�� �迭�� ��ȯ
		for(Method m : methods) {
			if(m.isAnnotationPresent(PrintAnotation.class)) {
				PrintAnotation print = m.getAnnotation(PrintAnotation.class);
				
				System.out.println("�޼ҵ��̸� " + m.getName());
				for(int i=0; i<print.number(); i++) {
					System.out.print(print.value());
				}
				System.out.println();
				
			}try {
				m.invoke(new Service()); //Ŭ���� �޼ҵ� ȣ��
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
