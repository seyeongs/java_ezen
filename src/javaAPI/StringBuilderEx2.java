package javaAPI;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str+=i;
		}
		System.out.println(str);
		StringBuilder buffer = new StringBuilder();
		for(int i=1; i<=100; i++) {
			buffer.append(i);
		}
		str = buffer.toString();
		System.out.println(str);
	}

}
