package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		// ����ڿ��� ã�� ���� ���ڸ� 1�������� 10���� �Է� �޾�,
		// �ش� ������ �ε����� ã�� ����ϴ� ���α׷��� ���弼��.
		// ��, ����ڰ� �Է��� ���� �迭 �ε����� ��Ÿ�� �� ���� ��� ã�� �� ���ٴ� ������ ����ϼ���.
		
		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6};
		int target; //�˰���� ����
		int index =-1; 
		//�迭 ������ ã�� ������ ��� �ʱ�ȭ. 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ã�� ���� ���ڸ� 1���� 10���̷� �Է��ϼ���: "); //4
		target=scan.nextInt();
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] == target) {
				index=i; //���� ���ڸ� ã���� ���� �����
				break;
			}//if
		}//for
		
		if(index != -1) {
			System.out.println(target+"��(��) "+index+"��° index�� ����.");
		}else {
			System.out.println("�����ͺ��̽��� �������� �ʴ� ���� �Դϴ�.");
		}
		
		
		

	}

}
