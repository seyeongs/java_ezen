package javaOject;

public class ArrayEx6 {

	public static void main(String[] args) {
		
//		String[] names = {"��ö��", "�̿���" , "ȫ�浿" , "����ȣ", "�̿�ǥ"};
//		System.out.println(names[0]);
		
		if(args.length == 2) {

			int num=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]); //int������ ��ȯ
			System.out.println(num+num2);
//			System.out.println(args[0]);
//			System.out.println(args[1]);
			
		}else {
			System.out.println("�Ű����� ����");
			
		}
				

	}

}
