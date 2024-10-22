package chapter05;

import javax.swing.JOptionPane;

public class FuncTest03 {
	
	//Display1(stack 영역), Display2(data 영역) 메서드로 출력
	public void Display1(String A[]) {
		String res=""; //빈문서
		
		for(int i=0;i<A.length;i++) {
			res+=A[i]+" ";
		}
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 요소값\n\n"+res);
		
	}
	
	 //Display2(data 영역) 메서드로 출력
		public static void Display2(String A[]) {
			String res=""; //빈문서
			
			for(int i=0;i<A.length;i++) {
				res+=A[i]+" ";
			}
			
			System.out.println(res);
			JOptionPane.showMessageDialog(null, "배열의 요소값\n\n"+res);
			
		}
	

	public static void main(String[] args) {
		
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		
		//stack에서 호출
		FuncTest03 obj=new FuncTest03();
		obj.Display1(str);
		
		//static메서드 호출
		Display2(str);
	}

}
