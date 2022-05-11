package javabase;

public class DoWhileEx1 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do { //선수행 조건 검사
			sum += i;
			i++;
			
		}while(i<=100); 
			System.out.println("1부터 100까지의 합 = " + sum);
	}

}
