package chapter06;

import java.util.Scanner;

public class UpDownMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//��ü����
		UpDown updown=new UpDown();
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			
			select=scan.nextInt();
			check=updown.check(select);
			
			if(check.equals("SUCCESS")) {
				break;
			}
		}
		
	}

}