package chapter03.iftest;

public class IfExample01 {

	public static void main(String[] args) {
		
		
		//���׿�����
		//String str=age>=8?"�б��� �ٴմϴ�":"�б��� �ٴ��� �ʽ��ϴ�";
		
		//#1 if
		int age=5;
		if(age>=8) {
			System.out.println("�б��� �ٴմϴ�");
		}
		System.out.println("�б��� �ٴ��� �ʽ��ϴ�");
		System.out.println("---------------------------");
		
		//#2 if
		int age2=10;
		if(age2>=8) {
			System.out.println("�б��� �ٴմϴ�");
		}else { //�׹ۿ�
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�");
		}
		
		

	}

}
