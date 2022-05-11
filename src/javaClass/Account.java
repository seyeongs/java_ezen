package javaClass;

//은행계좌
public class Account {
	//필드
	static final String BANKNMAE = "신한은행";
	String accountNo; //계좌번호
	String ownerName; //예금주
	int balance; //잔액
	
	Account() { //생성자는 반환 타입이 없다 
		this.accountNo = "124-124-124-124";
		this.ownerName = "무기명";
		this.balance = 0;
	}
	
	Account(String accNum, String name, int balance) { //하나의 단일 클래스에서 생성자는 여러개일 수 있지만 요구되는 매개변수가 달라야 한다
		this.accountNo = accNum;
		this.ownerName = name;
		this.balance = balance;
	}
	//메소드
	void deposit(int amount) {
		this.balance += amount;
//		System.out.println(this.balance);
	}
	
	int withdraw(int amount) throws Exception{ //인위적 예외처리
 		
		if(this.balance < amount) {
			throw new Exception("잔액이 부족합매");//인위적 예외처리
		}
		this.balance -= amount;
//		System.out.println(this.balance);
		return amount;
	}
}
