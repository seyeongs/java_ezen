package javaClass;

//�������
public class Account {
	//�ʵ�
	static final String BANKNMAE = "��������";
	String accountNo; //���¹�ȣ
	String ownerName; //������
	int balance; //�ܾ�
	
	public Account() { //�����ڴ� ��ȯ Ÿ���� ���� 
		this.accountNo = "124-124-124-124";
		this.ownerName = "�����";
		this.balance = 0;
	}
	
	public Account(String accNum, String name, int balance) { //�ϳ��� ���� Ŭ�������� �����ڴ� �������� �� ������ �䱸�Ǵ� �Ű������� �޶�� �Ѵ�
		this.accountNo = accNum;
		this.ownerName = name;
		this.balance = balance;
	}
	//�޼ҵ�
	void deposit(int amount) {
		this.balance += amount;
//		System.out.println(this.balance);
	}
	
	int withdraw(int amount) throws BalanceInstufficientException{ //������ ����ó��
 		
		if(this.balance < amount) {
			throw new BalanceInstufficientException("�ܾ��� �����ո�(" + (amount- balance) + "�� ����");//������ ����ó��
		}
		this.balance -= amount;
//		System.out.println(this.balance);
		return amount;
	}
}
