package javabase;

public class ForEx5 {

	public static void main(String[] args) {
//		for(int i = 1; i<=10; i++) {
//			System.out.println(i);
//			if(i==4) {
//				System.out.println("�ߴ�");
//				break;
//			}
//		}
		//3500�� ������� �� ���� ���ϸ� �ɱ��
		int i;
		int sum = 0;
		System.out.println("3500�� ������� �� ���� ���ϸ� �ɱ��?");
		for(i = 1; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
			if(sum>=3500) {
				break;
			}
		}
		System.out.println("����:" + i + " ���Ѱ�:" + sum);
		System.out.println(sum-i);
//		System.out.println("1���� 100������ ���� = " + sum);
	}

}
