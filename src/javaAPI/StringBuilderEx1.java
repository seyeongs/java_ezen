package javaAPI;

public class StringBuilderEx1 {

	public static void main(String[] args) {
//		String data = "korea ";
//		data+="fighting "; //새로운 객체가 생성되고 주소가 변경된다
//		data+="corona"; //새로운 객체가 생성되고 주소가 변경된다
//		System.out.println(data);
		//객체가 메모리에 새로 할당되므로 문자결합 + 연산자를 쓰면 쓸수록 메모리가 점점 쌓인다
		//따라서 문자열 연결 작업이 많을 때는 버퍼(buffer(임시 저장 메모리)를 사용하는 StringBuilder 클래스를 사용하는 것이 좋다 
		
		StringBuilder sb = new StringBuilder();
		sb.append("java "); //버퍼에 추가
		sb.append("Pregram Study");//앞서 추가한 "java" 뒤에 추가된다
		sb.insert(12, "ning"); //12번째 인덱스에 삽입
		sb.setCharAt(12, 'm'); //12번째 인덱스 글자 바꾸기
		sb.setCharAt(7, 'o'); //12번째 인덱스 글자 바꾸기
		sb.replace(5,16, "API");//5~15인덱스를 대체
		sb.delete(4, 8);//4~7인덱스 삭제
		System.out.println(sb.toString());
		System.out.println("총 글자수 " + sb.length());
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
