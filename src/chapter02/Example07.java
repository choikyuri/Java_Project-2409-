package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// �� �ڸ��� ���ڸ� �Է¹޾� (scan)
		// ���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �ڸ��� ���� �Է�: ");
		int number=scan.nextInt();//9
		/*
		String result=(number % 2 ==0)?"¦��":"Ȧ��";
		System.out.println(result);
		*/
		
		int remainder=number % 2; 
		boolean isOdd=remainder==1; //true�Ǵ�false
		
		String result=isOdd?"Ȧ��":"¦��";
		System.out.println(result);

	}

}
