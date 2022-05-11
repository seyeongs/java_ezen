package javabase;

public class ForEx10 {

	public static void main(String[] args) {
		/*문제) 
		족발집(돼지족, 타조족)
		직영농장
		직원이 농장에 가서 돼지족과 타조족을 가져온다. 몸통 영수증 가져온다.
		자루 => 56족 돼지족 몇 개 타조족 몇 개?
		영수증 17마리 ?????원 돼지 몇 마리? 타조 몇 마리?
		
		실행결과) 돼지 00마리, 타조 00마리
		
		*/
		int foots = 56;
		int pig=0;
		int tajo=0;
		int count = 17;
		int sum=0;
		
		for(int i = 1; i<=17; i++) {
			pig += 4;
			tajo += 2;
			sum = pig + tajo;
			for(int j = 1; sum>56; j++) {
				pig--;
				tajo--;
				if(pig%4==0 && tajo%2==0) {
				if(tajo/2+pig/4==17) {
					sum = pig + tajo;
				}
				}
			}
		}
		System.out.println(pig/4 +" "+ tajo/2 +" "+ sum);
			
		}
		

	}


