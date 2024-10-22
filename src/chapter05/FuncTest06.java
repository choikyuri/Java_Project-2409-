package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int edu) {
		
		String step="";
		
		switch(edu) {
		case 1:
			step="초급";
			break;
		case 2:
			step="중급";
			break;
		case 3:
			step="고급";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			step="0단계 ";
			break;
	
		}//switch
		
		return step;
		
	}//메서드
	

	public static void main(String[] args) {
		// 사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number = scan.nextInt(); //2
         //1:초급 2:중급 3:상급
		String step=EduStep(number); // number는 실 매개변수
		System.out.println("현재 수업 단계는 "+step+"입니다.");

	}

}
