package chapter05;

public class Example02 {
	
	/*�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����ϴ� �޼ҵ带 �����غ�����.*/
	private static int sum1(int a, int b) {
		//int hap=a+b;
		//return hap;
		return a+b;
	}
	
	public static void sum2(int a, int b) {
		System.out.println("void�޼��忡�� ��� "+(a+b));
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		//��ȯ���� �ִ� �޼��� 
		int result=sum1(num1, num2);
		System.out.println("��ȯ�� ���: "+result);
		
		//��ȯ���� ����
		sum2(num1, num2);

	}

}
