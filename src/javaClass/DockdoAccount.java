package javaClass;

public class DockdoAccount extends Account{
	int point;
	
	public DockdoAccount(String accountNo, String ownerName, int balance, int point ) {
		super(accountNo, ownerName, balance);
		this.point = point;
	}
	//�޼���
	@Override
	public void deposit(int amount) {
		super.deposit(amount); //�θ� �޼ҵ� ��Ȱ��
		point += (int)(amount*0.001);
	}
	
}
