package javaClass;

//���̳ʽ�����
public class CreditLineAccount extends Account{
	
	int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine ) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	public CreditLineAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Override // �ڹ� ���� ������̼� anotation // ������ �������� �θ� Ŭ������ �޼ҵ带 üũ�ϰ� �˷��ش�
	int withdraw(int amount) throws Exception{
		if(balance + this.creditLine<amount) {
			throw new Exception("���̳ʽ� �ѵ� �ʰ�");
		}
		balance -= amount;
		return amount;
	}	
}
