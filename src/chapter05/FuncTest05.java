package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	//EduStep 메서드 구현
	public static void EduStep(int edu) {
		
		if(edu==1) {
			System.out.println("현재 스터디 단계는 step1 입니다.");
		}else if(edu==2) {
			System.out.println("현재 스터디 단계는 step2 입니다.");
		}else if(edu==3) {
			System.out.println("현재 스터디 단계는 step3 입니다.");
		}else {
			System.out.println("해당하는 스터디 단계가 없습니다.");
		}//if
		
	}
	

	public static void main(String[] args) {
		
		//사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scan= new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number=scan.nextInt();
		
		EduStep(number); //number는 실 매개변수		

	}

}
