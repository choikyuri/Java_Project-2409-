package chapter02;

public class Example02 {

	public static void main(String[] args) {
		/*soldesk ������
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ��� ������ Ÿ���� float)�� �����Ѵ�.
		 */
		
		int pear=5;
		int apple=7;
		int orange=5;
		//#1
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����: "+(pear+apple+orange)+"��");
		System.out.println("�ð��� ��ü ������ ��� ���� ����: "+((float)(pear+apple+orange)/24)+"��");
		System.out.println("==========================");
		//#2
		int fruitTotal=pear+apple+orange;
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����: "+fruitTotal);
		
		float fruitAvg=fruitTotal/24f;
		System.out.println("�ð��� ��ü ������ ��� ���� ����: "+fruitAvg);
		
		
		
		

	}

}
