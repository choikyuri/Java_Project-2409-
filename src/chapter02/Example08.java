package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��°(num1) ���ڰ� �� ��°(num2) ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 = scanner.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = scanner.nextInt();
		
		boolean isGreaterThan=num1>num2; //true or false
		
		System.out.println("ù ��° ���ڰ� �� ��° ���ں��� ū��? "+isGreaterThan);

	}

}
