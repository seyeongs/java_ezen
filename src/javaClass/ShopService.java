package javaClass;

public class ShopService {
	
	private static ShopService shop = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shop;
	}

}
