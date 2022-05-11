package javaClass;

//상품 제고 클래스를 제작하시오
//클래스 이름: GoodsStock
//필드 변수)
//상품 코드
//String goodsCode;
//제고수량
//int stockNum;
//메소드)
//제고 더하기 빼기 addStock substractStock
//
public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	void substractStock(int amount) {
		stockNum -= amount;
		if(stockNum<0) {
			stockNum = 0;
		}
	}
}
