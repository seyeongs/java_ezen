package javaClass;
//제작한 어노테이션 적용 클래스
public class Service {
	
	@PrintAnotation
	public void corona() {
		System.out.println("코로나 박멸");
	}
	
	@PrintAnotation("*")
	public void corona2() {
		System.out.println("오미크론 박멸");
	}
	
	@PrintAnotation(value = "$", number = 30)
	public void corona3() {
		System.out.println("코로나 델타 박멸");
	}
}
