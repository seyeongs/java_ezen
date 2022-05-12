package javaAPI;

import java.util.StringTokenizer;

public class StringToKenizerEx1 {

	public static void main(String[] args) {
		String str = "홍길동*김철수*이영희";
		StringTokenizer strt = new StringTokenizer(str, "*"); //*를 기준으로 토큰으로 분리//구분자가 한 글자일 때, 한 글자 이상은 안됨
	  /*int countTokens = strt.countTokens(); //3개 토큰이 반환됨
		for(int i=0; i<countTokens; i++) {
			String name = strt.nextToken(); // 토큰을 꺼내어 순차대로 리턴한다
			System.out.println(name);
		}*/ //방법1
		while(strt.hasMoreTokens()) { //남아 있는 토큰이 있는지 여부 있으면 true, 없으면 false
			String name = strt.nextToken();
			System.out.println(name);
		}
		
	}

}
