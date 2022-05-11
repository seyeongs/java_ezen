package javabase;

public class IFStatementEx5 {

	public static void main(String[] args) {
		//시험 점수 80점 이상 합격, 70~79점이면 대기자, 69이하 불합격
		int score = 69;
		if(score>79) {
			System.out.println("합격입니다");

		}
		else if(score>69) {
			System.out.println("대기자입니다");
		}else {
			System.out.println("불합격입니다");
		}

	}
	
}
