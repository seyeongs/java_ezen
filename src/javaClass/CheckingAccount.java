package javaClass;

//üũī�� Ŭ����

public class CheckingAccount extends Account {
	String cardNo;
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		
		super(accountNo, ownerName,balance); //�θ��� ������ ȣ��
		this.cardNo = cardNo;
		
	}
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	//üũī�� ���� �޼ҵ�
	int pay(String cardNo,int amount) throws Exception {
		if(!this.cardNo.equals(cardNo)) {
			throw new Exception("ī���ȣ�� ��ġ���� �ʽ��ϴ�");
		}
		return withdraw(amount);
	}
	
	
	
	
}
