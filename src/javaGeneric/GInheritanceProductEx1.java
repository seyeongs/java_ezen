package javaGeneric;

public class GInheritanceProductEx1 {

	public static void main(String[] args) {
		GInheritanceProduct<MultiGenericCar, String, String> car1 = new GInheritanceProduct<MultiGenericCar, String, String>();
		
		car1.setCompany("����");
		car1.setKind(new MultiGenericCar());
		car1.setModel("������");
		
		GInheritanceProduct<MultiGenericTv, String, String> tv1 = new GInheritanceProduct<MultiGenericTv, String, String>();
		
		tv1.setCompany("�ݼ�");
		tv1.setKind(new MultiGenericTv());
		tv1.setModel("���̹� �����");
	}

}
