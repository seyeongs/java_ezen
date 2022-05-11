package javaClass;

public class CreditLineAccountEx1 {

	public static void main(String[] args) {
		CreditLineAccount chul = new CreditLineAccount("111-111", "철수", 10, 1000000);
		
		chul.deposit(100);
		try {//throws 메소드는 트라이 캐치문
			int amount = chul.withdraw(500000);
			System.out.println("찾은 금액: " + amount);
			System.out.println("잔액: " + chul.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
