package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {

		// �����ͼ�
		String ID = "soldesk";
		int PW = 240910;

		// ��
		Scanner scan = new Scanner(System.in);

		System.out.print("���̵� : ");
		String id = scan.nextLine();

		if (ID.equals(id)) {
			// ��й�ȣ
			System.out.print("��й�ȣ : ");
			int pass=scan.nextInt();
			if (PW == pass) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
		}

	}

}
