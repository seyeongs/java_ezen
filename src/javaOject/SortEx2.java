package javaOject;

public class SortEx2 {

	public static void main(String[] args) {
		//������) **���� �ڷ� ���**
		//��ö�� - 68
		//��ö�� - 99
		//...
		
		//**������ �ڷ� ���**
		// 1��: ...
		// 2��: ...
		
		int[] scores = {68, 49, 39, 45, 88};
		String[] names = {"�����", "��ö��", "ȫ�ֿ�", "�����", "����ö"};
		int temp;
		String temp_name;
		
		System.out.println("** ���� �ڷ� ���**");
		for(int i=0; i<scores.length; i++) {
			System.out.println(names[i] + " - " + scores[i]);
		}
		
		
		
		for(int a = 0; a<scores.length-1; a++) {
			for(int j=a+1; j<scores.length; j++) {
				if(scores[a]<scores[j]) {
					temp = scores[a];
					scores[a] = scores[j];
					scores[j] = temp;
					
					temp_name = names[a];
					names[a] = names[j];
					names[j] = temp_name;					
				}
			}
		}
		
		
		System.out.println();
		for(int k = 0; k<scores.length; k++) {
			System.out.println((k+1)+"��: " + names[k] + " - " + scores[k]);
		}
	}

}
