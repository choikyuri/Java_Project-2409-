package chapter05;

import javax.swing.JOptionPane;

public class FuncTest03 {
	
	//Display1(stack ����), Display2(data ����) �޼���� ���
	public void Display1(String A[]) {
		String res=""; //�󹮼�
		
		for(int i=0;i<A.length;i++) {
			res+=A[i]+" ";
		}
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "�迭�� ��Ұ�\n\n"+res);
		
	}
	
	 //Display2(data ����) �޼���� ���
		public static void Display2(String A[]) {
			String res=""; //�󹮼�
			
			for(int i=0;i<A.length;i++) {
				res+=A[i]+" ";
			}
			
			System.out.println(res);
			JOptionPane.showMessageDialog(null, "�迭�� ��Ұ�\n\n"+res);
			
		}
	

	public static void main(String[] args) {
		
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		
		//stack���� ȣ��
		FuncTest03 obj=new FuncTest03();
		obj.Display1(str);
		
		//static�޼��� ȣ��
		Display2(str);
	}

}
