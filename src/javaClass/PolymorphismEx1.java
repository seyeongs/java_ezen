package javaClass;

public class PolymorphismEx1 {

	public static void main(String[] args) {
//		Account chul = new Account();
//		CheckingAccount gil = new CheckingAccount();
//		CreditLineAccount min = new CreditLineAccount();
		
		Account chul = new CheckingAccount(); //다형성 //부모 자식간에는 자동 형변환이 된다. // 자식 클래스의 오버라이드된 메소드를 쓴다 
		Account gil = new CreditLineAccount();
		gil.deposit(100); // creditLineAcount 클래스의 오버라이드된 메소드를 쓴다
		Account chan = new DockdoAccount(null, null, 0, 0);
		CheckingAccount young = (CheckingAccount)chul; // 자식 타입에 부모 타입을 넣으려면 캐스팅 해줘야 한다
		
		
	}

}
