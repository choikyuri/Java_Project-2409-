package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*���ð��� ������ ������ �Ƶ��� 1000�� ->7
		���ð��� ������ �ʵ��л��� 2000��->13
		���ð��� ������ ��,����л��� 3500�� ->19
		���ð��� ������ ������ 5000��*/
		
		int age;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		
		/*
		//#1
		if(age<7) {
			charge=1000;
			System.out.println("������ �Ƶ��Դϴ�");
		}else if(age<=13) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�");
		}else if(age<=19) {
			charge=3500;
			System.out.println("��.����л� �Դϴ�");
		}else {
			charge=5000;
			System.out.println("���� �Դϴ�");
		}
		
		System.out.println("������: "+charge+" �Դϴ�.");
		*/
		//#2
		String dev;
		int mon;
		
		if(age>=20) {
			dev="����";
			mon=5000;
		}else if(age>=14) {
			dev="��.����л�";
			mon=3500;
		}else if(age>=8) {
			dev="�ʵ��л�";
			mon=2000;
		}else {
			dev="������ �Ƶ�";
			mon=1000;
		}
		
		System.out.println(dev+" �Դϴ�.");
		System.out.println("������: "+mon+" �Դϴ�.");
	}

}
