package chapter02;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/* 변수방에 51를 대입(변수방 : number)
		 그 수가 양수인지 여부를 판별하는 프로그램
		 변수방에 저장된 수가 양수면 "양수입니다"
		 그렇지 않음 경우 "음수 또는 0입니다."라고 출력이 되어야함 
		 */
		
		//변수 초기화
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int number=scan.nextInt();
		//양수인지 여부를 판별하는 변수방 isPositive
		boolean isPositive=number>0;
		//삼항연산자
		String result=isPositive?"양수입니다":"음수 또는 0입니다.";
		System.out.println(result);
		System.out.println("---------------------------");
		int _num=-5;
		String numResult=(_num>0)?"양수입니다":"음수 또는 0입니다.";
		System.out.println(numResult);
		

	}

}
