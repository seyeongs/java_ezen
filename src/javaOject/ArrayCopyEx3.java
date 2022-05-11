package javaOject;

public class ArrayCopyEx3 {

	public static void main(String[] args) {
		
		String[] str1 = {"김철수","이영이","김덕수"};
		String[] str2 = new String [5];
		
		
		System.arraycopy(str1, 0, str2, 0, str1.length); //System.arraycopy(원본배열, 시작인덱스, 복사본배열, 시작인덱스, 복사할 인덱스 갯수);
		
		
		
		for(int i = 0; i<str2.length; i++) {
			
			System.out.print(str2[i]+"  ");
		}//str2 출력 빈 인덱스에는 null값이 들어가 있따
		
		// 

	}

}
