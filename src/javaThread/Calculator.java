package javaThread;
//���� Ŭ����
public class Calculator {
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //����ȭ �޼ҵ�(Synchronized)
													 //Ŭ������ 2�� �̻��� �����尡 ������ �� 1���� ������ �۾��� ���� �� ���� ��ü�� ��ż� �ٸ� �����尡 ����� �� ������ �ϴ� �۾�
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+";" + this.memory);
	}
	
	
}
