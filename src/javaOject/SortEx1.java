package javaOject;

public class SortEx1 {

	public static void main(String[] args) {
		// asending sort: ��������
		// desending sort: ��������
		
		//�ڷ� ���
		int num[] = {23, 4, 6, 124, 323,352};
		int buffer;
		System.out.println("sort�� �ڷ����");
		for(int i = 0; i<num.length; i++) {
			
			System.out.print(num[i] + "  ");
			
		}
		
		//selection sort �˰���
		for(int k = 0; k<num.length-1; k++) { //������ �迭 �ε����� ���� �ʿ䰡 �����Ƿ� .lengrh-1
			
			for(int j = k+1; j<num.length; j++) {
				
				if (num[k]>num[j]) { //���ǹ� �ε�ȣ�� �ٲ㼭 asending, desending ����
					buffer = num[k];
					num[k] =  num[j];
					num[j] = buffer;
				}
			}
		}
		
		System.out.println("\n");
		System.out.println("sort �� ���");
		
		for(int i = 0; i<num.length; i++) {
			
			System.out.print(num[i] + "  ");
		}
	}
}
