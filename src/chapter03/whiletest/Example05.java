package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*���� ���߱� ����
		1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ����
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���" ���
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ���
		������ ���ڸ� ��Ȯ�� ���� ������ ������ �ݺ�
		���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���*/
		
		Scanner scan = new Scanner(System.in);
		
		Random random=new Random();
		//PC�� ���� ����
		int targetNumber=random.nextInt(100)+1;
		int guest; //��
		int count=0;
		
		System.out.println("1���� 100���� ���ڸ� ���纸����!");
		
		//------------------------------------------------------
		//������
		do {
			System.out.print("������ ���ڸ� �Է��ϼ���: ");
			guest = scan.nextInt();//��
			count++;
			
			if(guest>targetNumber) {
				System.out.println("�� ���� ���ڸ� �����ϼ���.");
			}else if(guest < targetNumber) {
				System.out.println("�� ū ���ڸ� �����ϼ���.");
			}
			
		}while(guest != targetNumber);
		
		//���
				System.out.println("�����մϴ�. ! "+count+"�� ���� ���߾����ϴ�");
				System.out.println("PC�� ������ ���� : "+targetNumber);
				System.out.println("User�� ������ ���� : "+guest);
		//----------------------------------------------------
		
		/*
		int guest2=0;
		boolean run=true;
		
		while(run) {
			System.out.print("1���� 100������ ���� �� �ϳ��� �������� : ");
			guest2=scan.nextInt();
			count++;
			if(guest2>targetNumber) {
				System.out.println("�� ���� ���ڸ� �����ϼ���");
			}else if(guest2<targetNumber) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
			}else if(guest2==targetNumber) {
				run=false;
			}
		}
		//���
		System.out.println("�����մϴ�. ! "+count+"�� ���� ���߾����ϴ�");
		System.out.println("PC�� ������ ���� : "+targetNumber);
		System.out.println("User�� ������ ���� : "+guest2);
        */
	}

}
