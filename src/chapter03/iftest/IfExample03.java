package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {
		
		char grade=0;
		int jumsu;
		
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		/*
		//#1
		if(jumsu>=90) {
			System.out.println('A');
		}else if(jumsu>=80) {
			System.out.println('B');
		}else if(jumsu>=70) {
			System.out.println('C');
		}else if(jumsu>=60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		*/
		
		//#2
		if (jumsu > 100) {
			System.out.println("없는 점수 입니다.");
		}else if (jumsu >= 90) {
			grade='A';
			System.out.println("최우수 학생입니다.");
		}else if(jumsu >= 80){
			grade='B';
			System.out.println("우수 학생입니다.");
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else {
			grade='F';
		}//if
		
		System.out.println("당신의 점수는 : "+grade+" 입니다.");
	
	}

}
