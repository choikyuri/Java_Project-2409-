package chapter03.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// �Է¹��� ���� �ʰ��ϸ� �ݸ��� ���ߴ� ����
		int i, sum=0;

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num=scan.nextInt(); //10
		
		for(i=1;;i++) {		
			if(sum>num) {
				break;
			}	
			sum+=i; //sum=sum+i
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println((i-1)+"������ ����: "+sum);

	}

}