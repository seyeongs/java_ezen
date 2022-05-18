package javaGeneric;

public class MultiGenericProductEx1 {

	public static void main(String[] args) {
		MultiGenericProduct<MultiGenericTv, String> product = new MultiGenericProduct<MultiGenericTv, String>();
		
		product.setKind(new MultiGenericTv());
		product.setModel("삼성 72인치 4k 165hz 스마트티비");
		MultiGenericTv tv = product.getKind();
		String tvModel = product.getModel();
		
		
		MultiGenericProduct<MultiGenericCar, String> product2 = new MultiGenericProduct<MultiGenericCar, String>(); 
		product2.setKind(new MultiGenericCar());
		product2.setModel("아반떼");
		
		MultiGenericCar car = product2.getKind();
		String carModel = product2.getModel();
	}

}
