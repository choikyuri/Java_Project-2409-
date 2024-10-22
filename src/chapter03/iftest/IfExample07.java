package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {

		// 데이터셋
		String ID = "soldesk";
		int PW = 240910;

		// 고객
		Scanner scan = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = scan.nextLine();

		if (ID.equals(id)) {
			// 비밀번호
			System.out.print("비밀번호 : ");
			int pass=scan.nextInt();
			if (PW == pass) {
				System.out.println(ID + "님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("일치하는 아이디가 없습니다.");
		}

	}

}
