package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int edu) {
		
		String step="";
		
		switch(edu) {
		case 1:
			step="�ʱ�";
			break;
		case 2:
			step="�߱�";
			break;
		case 3:
			step="���";
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			step="0�ܰ� ";
			break;
	
		}//switch
		
		return step;
		
	}//�޼���
	

	public static void main(String[] args) {
		// ����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number = scan.nextInt(); //2
         //1:�ʱ� 2:�߱� 3:���
		String step=EduStep(number); // number�� �� �Ű�����
		System.out.println("���� ���� �ܰ�� "+step+"�Դϴ�.");

	}

}
