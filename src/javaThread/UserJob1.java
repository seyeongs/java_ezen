package javaThread;
//����ȭ ���(Synchronized)
//Ŭ������ 2�� �̻��� �����尡 ������ �� 1���� ������ �۾��� ���� �� ���� ��ü�� ��ż� �ٸ� �����尡 ����� �� ������ �ϴ� ��
//
public class UserJob1 extends Thread{
	
	private Calculator calc;
	

	public void setCalc(Calculator calc) {
		this.setName("uerJob1");
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory(100);
	}
}
