package javabase;

import java.util.Scanner;

public class IFStatementEx6 {

	public static void main(String[] args) {
		// ����)�ַܼ� ������ �Է¹޾� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���) 90<= a��� \ 80<= b \ 70<= c \ 60 d \ else f
		// ������) ������ �Է����ּ��� = >
				   //c���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� - > ");
		int score = sc.nextInt();
		
		if (score>100 || score<0) {
			System.out.println("�ùٸ� ���� �Է����ּ���");
		}else {
			if(score>=90) {
				if(score>=95) {
					System.out.println("A+����Դϴ�");
				}else {
					System.out.println("A����Դϴ�");
				}
			}else if (score>=80) {
				if(score>=85) {
					System.out.println("b+����Դϴ�");
				}else {
					System.out.println("b����Դϴ�");
				}
			}else if (score>=70) {
				if(score>75) {
					System.out.println("c+����Դϴ�");
				}else {
					System.out.println("c����Դϴ�");
				}
			}else if (score>=60) {
				if(score>=65) {
					System.out.println("d+����Դϴ�");
				}else {
					System.out.println("d����Դϴ�");
				}
			}else {
				System.out.println("F����Դϴ�");
			}
		}
	}
}
