package javaClass;

public class Cheomseongdae {
	
	private static Cheomseongdae cheom = new Cheomseongdae();
	
	//
	private Cheomseongdae(){}
	
	static Cheomseongdae getInstance() {
		return cheom;
	}
	
	void history() {
		System.out.println("���翡�� ���� ������ ������");
	}
			
}
