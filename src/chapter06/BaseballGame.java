package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	// �������
	private int[] num = new int[3]; // ��ǻ���� ������ ����
	private String result;

	Scanner scan = new Scanner(System.in);

	// ������(computer number)
	public BaseballGame() {
		outer:for (int i = 0; i < 3;) {
			num[i] = new Random().nextInt(9) + 1;
			// �ߺ��� ����
			 for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					continue outer;
				} // if
			} // for
			i++;
		} // for
	}// BaseballGame ������

	// -------------------------------------------------
	// �޼���
	public String check(){
		result = "OUT";
		int[] myNum = new int[3];
		int strike = 0;
		int ball = 0;
		
		System.out.println("1~9������ ���� �Է��ϼ���");
		String[] numStr = {"ù", "��", "��"};
		for(int i=0;i<3;i++) {
			do {
			System.out.print(numStr[i] + "��° ���� �Է��ϼ��� > ");
			myNum[i] = scan.nextInt();
				if(myNum[i]>9||myNum[i]<1) {
					System.err.println("1~9 ������ ���� �Է��ϼ���"); //����ó��
				}
			}while(myNum[i]>9||myNum[i]<1); 
			//�ߺ�����
			for(int j=0;j<i;j++) {
				if(myNum[i]==myNum[j]) {
					System.err.println("�ߺ��� ���Դϴ�. �ٽ� �Է��ϼ���");
					i--;
					break; //�ٽ� for������ 
				}
			}
		
		//=============================================================
			for(int j=0;j<i;j++) {
				if(myNum[i]==num[j]) {//���� ����
					if(i==j) { //�ڸ� ����
						strike++;
					}else {
						ball++;
					}//if
				}//if
			}//in for	
		}//out for
		//====================================
		//���
		if(strike==3) {
			result = "WIN";
		}else if(strike+ball!=0) {//Integer.toString : int => string
			result = Integer.toString(strike) + "Strike " + Integer.toString(ball) + "Ball";
		}
		
		System.out.println(result + "!!");
		
		return result;
	
	}//�޼���
}
// class