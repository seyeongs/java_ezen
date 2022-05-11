package javaClass;

//체크카드 클래스

public class CheckingAccount extends Account {
	String cardNo;
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		
		super(accountNo, ownerName,balance); //부모의 생성자 호출
		this.cardNo = cardNo;
		
	}
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	//체크카드 결제 메소드
	int pay(String cardNo,int amount) throws Exception {
		if(!this.cardNo.equals(cardNo)) {
			throw new Exception("카드번호가 일치하지 않습니다");
		}
		return withdraw(amount);
	}
	
	
	
	
}
