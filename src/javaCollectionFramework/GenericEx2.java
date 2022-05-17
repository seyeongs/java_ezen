package javaCollectionFramework;

public class GenericEx2 {

	public static void main(String[] args) {
		//제네릭을 안 쓸 경우
//		GenericBox gBox = new GenericBox();
//		
//		gBox.set("홍길동");
//		String str = (String)gBox.get(); //Object타입을 반환하기 때문에 String으로 타입변환을 해줘야한다
//		gBox.set(new GenericApple());
//		GenericApple apple = (GenericApple)gBox.get(); //마찬가지
		GenericBox<String> gBox1 = new GenericBox<String>();
		
		gBox1.set("김찰수");
		String name = gBox1.get();
		
		
		GenericBox<GenericApple> gBox2 = new GenericBox<GenericApple>();
		
		gBox2.set(new GenericApple());
		GenericApple apple = gBox2.get();
		

	}

}
