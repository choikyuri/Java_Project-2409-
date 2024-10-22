package chapter05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));

		int cnt = 0;
		System.out.println("==== �̹��� �ζ� �����ȣ ====");
		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "] : ");
			int[] lotto = new int[6];
			int index = 0;
			//�ζ� ��ȣ 6�� ���
			while(index < 6) {
				int num=(int)(Math.random()*45)+1;
				if(!contains(lotto, num)) {//�ߺ�üũ //lotto t=int[] arr, num
					lotto[index++]=num;
				}//if
			}//while
			
			//�ζ� ���� ���
            for(int num:lotto) {
            	System.out.print(num+" ");
            }
            System.out.println();
            cnt++; //�ټ� ����
		} //while
	}//main
   //------------------------------------------------------------------------
	// �ߺ�üũ���ִ� �޼ҵ�
	public static boolean contains(int[] arr, int num) {//int[] ;lotto=new int[];, int num
		 for(int i:arr) {
		     if(i==num) {//�迭�濡 �ִ¼���==��� ���� ����
			   return true;//�ߺ����� �ִ�
			}//if
		}//for
		 return false;//�ߺ����� ����
	}//contains

}
