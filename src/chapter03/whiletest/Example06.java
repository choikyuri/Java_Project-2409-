package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		int cnt, num;
		boolean run = true;
		String str = ""; 
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			
			num=Integer.parseInt(scan.nextLine()); //1. 2. 3
			
			switch (num) {
			case 1: 
				System.out.print("빵 개수 입력 : ");
				cnt=Integer.parseInt(scan.nextLine()); //3
				
				for(int i=0;i<cnt;i++) {
					System.out.println("빵"+(i+1)+"개");
				}
				
				System.out.println("빵"+cnt+"개가 완성 되었습니다.");
				break;
			case 2:
				System.out.print("빵 개수 입력 : ");
				cnt=Integer.parseInt(scan.nextLine()); 
				System.out.print("종류 선택 : ");
				str=scan.nextLine();
				
				for(int i=0;i<cnt;i++) {
					System.out.println(str+"빵 "+(i+1)+"개");
				}
				
				System.out.println("요청하신 "+cnt+"개의 " + str+"빵이 완성 되었습니다.");
				break; 
			case 3: 
				System.out.println("프로그램 종료");
				run=false;
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}//switch
			
		}//while

	}//main

}//class
