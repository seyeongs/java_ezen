package javabase;

public class OperatorEx3 {

	public static void main(String[] args) {
		//연산순서
		int num = 10;
		num = num + 20;
		
		System.out.println(num);

		int score = 75;
		System.out.println("최종 점수는  = " + score + 10); //연산 순서 때문에 정수가 문자열화 된다
		System.out.println("최종 점수는  = " + (score + 10));
		
		//증감연산자
		int i = 0 ;
		//후위
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println(""); // 공백
		
		i = 0;
		//전위
		System.out.println(++i);
		System.out.println(--i);
		System.out.println(++i);
		System.out.println(i);
	}

}
