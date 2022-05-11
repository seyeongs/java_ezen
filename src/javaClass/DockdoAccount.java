package javaClass;

public class DockdoAccount extends Account{
	int point;
	
	public DockdoAccount(String accountNo, String ownerName, int balance, int point ) {
		super(accountNo, ownerName, balance);
		this.point = point;
	}
	//메서드
	@Override
	public void deposit(int amount) {
		super.deposit(amount); //부모 메소드 재활용
		point += (int)(amount*0.001);
	}
	
}
