package javaOject;

public class Magic {

	public static void main(String[] args) {
		int[][] magic =new int[11][11]; // 3x3
		
		int row = 0; //��
		int col = magic[0].length/2; //��
		int count=0;
		
		//���� ������ ¥��
		int num = 1; //�迭�� ���� ����
		magic[row][col] = num;
		for(num=2; num<=magic.length*magic[0].length; num++) {
			
			row--;
			col++;
			if(row<0 && col>magic[0].length-1) {
				row += 2;
				col--;
			}
			if(row<0) { //���� ���� ��
				row = magic.length-1;
			}
			if(col==magic[0].length) { //���� ���� ��
				col = 0;
			}
			if(magic[row][col]>0) { //�̹� ���� �����ϴ� ���
				row += 2;
				col--;
			}
			magic[row][col] = num;
			}
		
		//�ֿܼ� ���
		for(int i=0; i<magic.length; i++) {
			for(int j=0; j<magic[0].length; j++) {
				count++;
				if(magic[i][j]<100) {
					System.out.print(magic[i][j] + " ");	
				}else if(magic[i][j]<10) {
					System.out.print(" "+magic[i][j] + " ");
				}else {
					System.out.print(magic[i][j] + " ");
				}
					
			
			}
		System.out.println();
		}
	}
	
}	




