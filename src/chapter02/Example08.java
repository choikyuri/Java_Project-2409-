package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
		
		boolean isGreaterThan=num1>num2; //true or false
		
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 큰가? "+isGreaterThan);

	}

}
