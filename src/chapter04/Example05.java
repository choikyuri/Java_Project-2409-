package chapter04;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// �л����� �Է¹޾�, ������ �Է��ϰ� ��������Ʈ�� ����ϰ� ������ ����� �м��ϴ� ������Ʈ
		boolean run = true;

		int studentNum = 0; // �л���
		int[] score = null; // int[] score=new int[5];
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scan.nextLine());
				score = new int[studentNum]; // �޸� Ȯ�� -> 2

			} else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("score[" + (i + 1) + "]> ");
					score[i] = Integer.parseInt(scan.nextLine()); // score�迭�濡 ��� �߰�
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + (i + 1) + "]: " + score[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i=0;i<score.length;i++) {
					max=max<score[i]?score[i]:max;
					/*
					if(max<score[i]) {
						max=score[i];
					}*/
					
					sum+=score[i]; //��������
				}
				//avg=sum/(double)score.length;
				avg=sum/(double)studentNum;
				System.out.println("�ְ� ����: "+max);
				System.out.println("����: "+sum);
				//System.out.printf("���: %.2f",avg);
				System.out.println(String.format("���: %.2f",avg));
			} else {
				run = false;
			} // if
		} // while
		System.out.println("���α׷� ����");
	}

}
