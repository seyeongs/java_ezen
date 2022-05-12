package javaAPI;

public class StringEx6 {
	public static void main(String[] args) {
		String name1 = new String("ȫ�浿");
		String name2 = new String("ȫ�浿");
		if(name1 == name2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
	}
}
