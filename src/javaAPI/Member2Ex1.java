package javaAPI;

public class Member2Ex1 {

	public static void main(String[] args) {
		Member2 origin = new Member2("hoh", 20, new int[] {10,20,30}, new Car("�׽���"));
		
		Member2 cloned = origin.getMember();
		
		cloned.scores[1] = 90;
		cloned.car.model = "������";
		System.out.println(origin.toString()); 
		System.out.println(cloned.toString()); 
		//origin �ʵ��� Car, scores�迭�� ���� Ÿ���̱� ������ ������ ��ü�� �ʵ忡�� ���� �޸� ������ �����ȴ�. 
		//���� ���� ��ü���� ���� Ÿ���� �ʵ带 ���� �����ϸ� �������� ������ �ȴ�
		//�׷��Ƿ� ����Ÿ���� ���� ������ �ƴ� ���� ������ �ؾ��Ѵ�
		
		
	}
}
