package javaOject;

public class Magic {

	public static void main(String[] args) {
		int[][] magic =new int[11][11]; // 3x3
		
		int row = 0; //행
		int col = magic[0].length/2; //열
		int count=0;
		
		//매직 스퀘어 짜기
		int num = 1; //배열에 넣을 숫자
		magic[row][col] = num;
		for(num=2; num<=magic.length*magic[0].length; num++) {
			
			row--;
			col++;
			if(row<0 && col>magic[0].length-1) {
				row += 2;
				col--;
			}
			if(row<0) { //행이 없을 때
				row = magic.length-1;
			}
			if(col==magic[0].length) { //열이 없을 때
				col = 0;
			}
			if(magic[row][col]>0) { //이미 값이 존재하는 경우
				row += 2;
				col--;
			}
			magic[row][col] = num;
			}
		
		//콘솔에 출력
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




