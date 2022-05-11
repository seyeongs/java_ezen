package javaOject;

public class SortEx1 {

	public static void main(String[] args) {
		// asending sort: 내림차순
		// desending sort: 오름차순
		
		//자료 출력
		int num[] = {23, 4, 6, 124, 323,352};
		int buffer;
		System.out.println("sort전 자료축력");
		for(int i = 0; i<num.length; i++) {
			
			System.out.print(num[i] + "  ");
			
		}
		
		//selection sort 알고리즘
		for(int k = 0; k<num.length-1; k++) { //마지막 배열 인덱스는 비교할 필요가 없으므로 .lengrh-1
			
			for(int j = k+1; j<num.length; j++) {
				
				if (num[k]>num[j]) { //조건문 부등호만 바꿔서 asending, desending 조절
					buffer = num[k];
					num[k] =  num[j];
					num[j] = buffer;
				}
			}
		}
		
		System.out.println("\n");
		System.out.println("sort 후 출력");
		
		for(int i = 0; i<num.length; i++) {
			
			System.out.print(num[i] + "  ");
		}
	}
}
