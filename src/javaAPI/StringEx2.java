package javaAPI;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		int index = str.indexOf("자바"); //문자열 중 찾고자 하는 문자와 일치하는 첫 번째 문자의 인덱스를 리턴한다, -1은 없다////////////////////
		System.out.println(index);
		System.out.println(str.length()); //인덱스가 아니라 문자수를 반환//////////////////////////////////
		if(index != -1) {
			System.out.println("자바에 대한 얘기입니다");
		}else {
			System.out.println("자바 얘기만 하세요");
		}
	}

}