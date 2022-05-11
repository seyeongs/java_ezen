package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee = new PhysicalInfo("ÀÌ¿µÈñ", 10, 135.5f, 38.0f);
		
		printPhysicalInfo(younghee);
		
		younghee.update(11,143.0f, 43.0f);
		
		printPhysicalInfo(younghee);
	}
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.height);
		System.out.println(obj.weight);
	}
}
