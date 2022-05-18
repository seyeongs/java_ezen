package javaGeneric;

public class GInheritanceProductEx1 {

	public static void main(String[] args) {
		GInheritanceProduct<MultiGenericCar, String, String> car1 = new GInheritanceProduct<MultiGenericCar, String, String>();
		
		car1.setCompany("현대");
		car1.setKind(new MultiGenericCar());
		car1.setModel("현슬라");
		
		GInheritanceProduct<MultiGenericTv, String, String> tv1 = new GInheritanceProduct<MultiGenericTv, String, String>();
		
		tv1.setCompany("금성");
		tv1.setKind(new MultiGenericTv());
		tv1.setModel("게이밍 모니터");
	}

}
