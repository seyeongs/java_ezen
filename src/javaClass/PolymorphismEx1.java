package javaClass;

public class PolymorphismEx1 {

	public static void main(String[] args) {
//		Account chul = new Account();
//		CheckingAccount gil = new CheckingAccount();
//		CreditLineAccount min = new CreditLineAccount();
		
		Account chul = new CheckingAccount(); //������ //�θ� �ڽİ����� �ڵ� ����ȯ�� �ȴ�. // �ڽ� Ŭ������ �������̵�� �޼ҵ带 ���� 
		Account gil = new CreditLineAccount();
		gil.deposit(100); // creditLineAcount Ŭ������ �������̵�� �޼ҵ带 ����
		Account chan = new DockdoAccount(null, null, 0, 0);
		CheckingAccount young = (CheckingAccount)chul; // �ڽ� Ÿ�Կ� �θ� Ÿ���� �������� ĳ���� ����� �Ѵ�
		
		
	}

}
