package chapter02;

import java.util.Scanner;

public class Example03 {

	// �������� ����ϴ� ������ ����
	public static void main(String[] args) {
		// #1
		// ���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		// �׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		// ����?�հ�:���հ�

		Scanner scan = new Scanner(System.in);

		System.out.print("score : ");
		int score = scan.nextInt();
		String pass = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println(pass + " �Դϴ�.");
		System.out.println("=======================");
		// #2
		// ���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		// score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�.
		
		System.out.print("score : ");
		int score2 = scan.nextInt();
		
		char grade=score2>90?'A':((score2>80)?'B':'C');
		System.out.println("����: "+grade);
		

	}

}
