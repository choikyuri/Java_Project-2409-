package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Java ������ ������ �Է��ϼ��� : ");
			int scr=scan.nextInt();
			/*
			//if -> 60�� �̻��̸� �հ� �׹ۿ� ���հ�
			// 0���� 100�ʰ��� "0~100������ ������ �Է� �����մϴ�."
			// OR -> ||
			if(scr < 0 || scr>100) {
				System.out.println("0~100������ ������ �Է� �����մϴ�.");
				break;
			}else if(scr >= 60) {
				System.out.println("�հ�");
				break;
			}
			else {
				System.out.println("���հ�");
				break;
			}//if
			*/
			//AND -> &&
			if(scr>=60 && scr<=100) { //60~100
				System.out.println("�հ�");
				break;
			}else if(scr<60 && scr>=0) { //0~59
				System.out.println("���հ�");
				break;
			}else {
				System.out.println("0~100������ ������ �Է� �����մϴ�.");
				break;
			}//if
		}//w
		System.out.println("���α׷� ����");
	}

}
