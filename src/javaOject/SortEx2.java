package javaOject;

public class SortEx2 {

	public static void main(String[] args) {
		//실행결과) **시험 자료 출려**
		//김철수 - 68
		//박철수 - 99
		//...
		
		//**성적순 자료 출력**
		// 1등: ...
		// 2등: ...
		
		int[] scores = {68, 49, 39, 45, 88};
		String[] names = {"김덕수", "박철수", "홍애영", "김우중", "문상철"};
		int temp;
		String temp_name;
		
		System.out.println("** 시험 자료 출력**");
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
			System.out.println((k+1)+"등: " + names[k] + " - " + scores[k]);
		}
	}

}
