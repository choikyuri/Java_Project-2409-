package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	// 멤버변수
	private int[] num = new int[3]; // 컴퓨터의 난수값 저장
	private String result;

	Scanner scan = new Scanner(System.in);

	// 생성자(computer number)
	public BaseballGame() {
		outer:for (int i = 0; i < 3;) {
			num[i] = new Random().nextInt(9) + 1;
			// 중복값 제거
			 for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					continue outer;
				} // if
			} // for
			i++;
		} // for
	}// BaseballGame 생성자

	// -------------------------------------------------
	// 메서드
	public String check(){
		result = "OUT";
		int[] myNum = new int[3];
		int strike = 0;
		int ball = 0;
		
		System.out.println("1~9사이의 수를 입력하세요");
		String[] numStr = {"첫", "두", "세"};
		for(int i=0;i<3;i++) {
			do {
			System.out.print(numStr[i] + "번째 수를 입력하세요 > ");
			myNum[i] = scan.nextInt();
				if(myNum[i]>9||myNum[i]<1) {
					System.err.println("1~9 사이의 수를 입력하세요"); //예외처리
				}
			}while(myNum[i]>9||myNum[i]<1); 
			//중복제거
			for(int j=0;j<i;j++) {
				if(myNum[i]==myNum[j]) {
					System.err.println("중복된 수입니다. 다시 입력하세요");
					i--;
					break; //다시 for문으로 
				}
			}
		
		//=============================================================
			for(int j=0;j<i;j++) {
				if(myNum[i]==num[j]) {//값이 같음
					if(i==j) { //자리 같음
						strike++;
					}else {
						ball++;
					}//if
				}//if
			}//in for	
		}//out for
		//====================================
		//출력
		if(strike==3) {
			result = "WIN";
		}else if(strike+ball!=0) {//Integer.toString : int => string
			result = Integer.toString(strike) + "Strike " + Integer.toString(ball) + "Ball";
		}
		
		System.out.println(result + "!!");
		
		return result;
	
	}//메서드
}
// class
