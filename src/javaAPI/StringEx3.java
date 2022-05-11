package javaAPI;

public class StringEx3 {

	public static void main(String[] args) {
//		String str = "korea";
//		String str1 = "안녕하세요";
//		System.out.println(str.length());
//		System.out.println(str1.length());
		//영문과 한글은 바이트 크기는 다르지만 같은 글자수로 센다
		
//		String str = "지금은 자바의 API에 대해 배우고 있습니다. 자바는 풍부한 라이브러리를 제공합니다.";
//		String newStr = str.replace("자바", "Java"); //찾아 바꾸기///////////////////////////////////////
//		System.out.println(newStr);
		
		String str = "제 이름은 정세영입니다. 정세영 자바를 공부하고 있습니다. 지금은 복습중입니다";
		String newStr = str.replace("세영", "자바");
		System.out.println(newStr);
	}

}
