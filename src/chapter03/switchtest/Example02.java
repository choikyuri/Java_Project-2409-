package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * ����ڷκ��� ������ �Է¹޾�(1~7) �ش� ���Ͽ� � ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���. 
		 * (������:������,ȭ����:���İ�Ƽ,------,�Ͽ���:�ʹ�)-->�������� �԰������ �ƹ��ų�
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �������? ");
		String str;
		str=scan.nextLine(); //���� �Է�
		
		switch (str) {
		case "������": 
			System.out.println("�ҹ�");
			break;
		case "ȭ����":
			System.out.println("������");
			break;
		case "������":
			System.out.println("����");
			break;
		case "�����":
			System.out.println("���̹�");
			break;
		case "�ݿ���":
			System.out.println("������");
			break;
		case "�����":
			System.out.println("���̹�");
			break;
		case "�Ͽ���":
			System.out.println("������");
			break;
		default:
			System.out.println("�� �� �Է� �ϼ̽��ϴ�.");
		
	}//switch
		
	}//main
}
