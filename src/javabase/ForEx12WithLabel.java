package javabase;

public class ForEx12WithLabel {

	public static void main(String[] args) {
	Outer:for(int i=1; i<=5; i++) { // ���̺�
			for(int j=1; j<=5; j++) {
				if(i*j == 15) {
					System.out.println(i*j);
					System.out.println(i +"  "+ j);
					break Outer; // �����ص� ���̺�� Ż��
				}
			}
		}

	}

}
