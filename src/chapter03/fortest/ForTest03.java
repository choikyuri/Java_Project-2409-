package chapter03.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// 입력받은 수를 초과하면 반목문을 멈추는 조건
		int i, sum=0;

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num=scan.nextInt(); //10
		
		for(i=1;;i++) {		
			if(sum>num) {
				break;
			}	
			sum+=i; //sum=sum+i
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println((i-1)+"까지의 총합: "+sum);

	}

}
