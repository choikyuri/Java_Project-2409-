package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// 10배수를 판단
		//조건 : dat에 있는 값을 10으로 나눈 나머지가 1이면 배수
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요."));
		
		if(dat % 10 == 0) {
			System.out.println(dat+"은(는) 10의 배수 입니다.");
		}else {
			System.out.println(dat+"은(는) 10의 배수가 아닙니다.");
		}

	}

}
