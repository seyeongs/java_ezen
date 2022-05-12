package javaAPI;

public class SplitEx1 {

	public static void main(String[] args) {
		String text = "김철수,이영희@홀길동#박찬호&이영표";
		String[] names = text.split(",|@|#|&"); // ,를 구분기호로 삼고 분리해서 배열에 넣는다//split은 |(비트or)로 구분 기호를 여러 문자를 지정할 수 있다 사용할 수 없는 문자도 있다
		for(String name : names) {
			System.out.println(name);
		}
	}	

}
