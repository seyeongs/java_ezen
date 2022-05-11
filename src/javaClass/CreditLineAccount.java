package javaClass;

//마이너스통장
public class CreditLineAccount extends Account{
	
	int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine ) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	public CreditLineAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Override // 자바 제공 어노테이션 anotation // 컴파일 과정에서 부모 클래스의 메소드를 체크하고 알려준다
	int withdraw(int amount) throws BalanceInstufficientException{
		if(balance + this.creditLine<amount) { 
			throw new BalanceInstufficientException("마이너스 한도 초과");
		}
		balance -= amount;
		return amount;
	}	
}
