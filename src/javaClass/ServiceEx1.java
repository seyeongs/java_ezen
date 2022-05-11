package javaClass;

import java.lang.reflect.Method;

public class ServiceEx1 {

	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods(); // 서비스 클래스에 정의된 메소드 정보를 메소드 타입 배열에 반환
		for(Method m : methods) {
			if(m.isAnnotationPresent(PrintAnotation.class)) {
				PrintAnotation print = m.getAnnotation(PrintAnotation.class);
				
				System.out.println("메소드이름 " + m.getName());
				for(int i=0; i<print.number(); i++) {
					System.out.print(print.value());
				}
				System.out.println();
				
			}try {
				m.invoke(new Service()); //클래스 메소드 호출
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
