package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {
		int amount=0;
		
//		Account account_seyeong = new Account(); //new: 인스턴스 생성
//		account_seyeong.accountNo= "111-222-333-444";
//		account_seyeong.ownerName= "세영";
//		account_seyeong.balance = 100000;
//		
//		account_seyeong.deposit(10000);
////		amount = account_seyeong.withdraw(3000);
//		
//		System.out.println("찾은 금액: "+amount);
//		System.out.println("잔액: "+account_seyeong.balance);
//		
		
		
		Account account_gil = new Account(); 
		account_gil.accountNo= "121-212-343-434";
		account_gil.ownerName= "길";
		account_gil.balance = 0;
		
		account_gil.deposit(1000);
		try {
			amount = account_gil.withdraw(30000000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("찾은 금액: "+amount);
		System.out.println("잔액: "+account_gil.balance);
		
		

	}
}
