package javaClass;

//��ǰ ���� Ŭ������ �����Ͻÿ�
//Ŭ���� �̸�: GoodsStock
//�ʵ� ����)
//��ǰ �ڵ�
//String goodsCode;
//�������
//int stockNum;
//�޼ҵ�)
//���� ���ϱ� ���� addStock substractStock
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
