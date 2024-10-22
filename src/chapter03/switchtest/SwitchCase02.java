package chapter03.switchtest;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("1~4사이의 번호를 입력하세요"));
		
		switch (num) {
		case 1: 
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		case 2: 
			System.out.println("출금를 선택하셨습니다.");
			break;
		case 3: 
			System.out.println("입금를 선택하셨습니다.");
			break;
		case 4: 
			System.out.println("송금를 선택하셨습니다.");
			break;
		default:
			System.out.println("번호를 잘 못 입력 하셨습니다.");
		}//switch

	}//main

}//class
