package javaAPI;

public class SplitEx1 {

	public static void main(String[] args) {
		String text = "��ö��,�̿���@Ȧ�浿#����ȣ&�̿�ǥ";
		String[] names = text.split(",|@|#|&"); // ,�� ���б�ȣ�� ��� �и��ؼ� �迭�� �ִ´�//split�� |(��Ʈor)�� ���� ��ȣ�� ���� ���ڸ� ������ �� �ִ� ����� �� ���� ���ڵ� �ִ�
		for(String name : names) {
			System.out.println(name);
		}
	}	

}
