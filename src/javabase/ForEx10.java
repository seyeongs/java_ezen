package javabase;

public class ForEx10 {

	public static void main(String[] args) {
		/*����) 
		������(������, Ÿ����)
		��������
		������ ���忡 ���� �������� Ÿ������ �����´�. ���� ������ �����´�.
		�ڷ� => 56�� ������ �� �� Ÿ���� �� ��?
		������ 17���� ?????�� ���� �� ����? Ÿ�� �� ����?
		
		������) ���� 00����, Ÿ�� 00����
		
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


