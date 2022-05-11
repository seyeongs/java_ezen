package javaOject;

public class ArrayEx6 {

	public static void main(String[] args) {
		
//		String[] names = {"김철수", "이영희" , "홍길동" , "박찬호", "이영표"};
//		System.out.println(names[0]);
		
		if(args.length == 2) {

			int num=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]); //int형으로 변환
			System.out.println(num+num2);
//			System.out.println(args[0]);
//			System.out.println(args[1]);
			
		}else {
			System.out.println("매개변수 업슴");
			
		}
				

	}

}
