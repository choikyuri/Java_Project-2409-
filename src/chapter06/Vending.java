package chapter06;

public class Vending {
	
	//������� 
	private Can[] can=new Can[5];
	private int money;
	
	//�⺻ ������

	//�޼ҵ�
	public void init() {
		can[0]=new Can("ȯŸ",1000);
		can[1]=new Can("���̴�",1200);
		can[2]=new Can("�������꽺",1100);
		can[3]=new Can("�ٳ�������",1400);
		can[4]=new Can("�ݶ�",1000);
	}
	
	//��� ������ ���Ḹ �����ִ� �޼���
	public void showCans(int m) {
		money=m;
		for(int i=0;i<can.length;i++) {
			if(can[i].getPrice()<=money) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"��");
			}	
		}//for	
	}//showCans
	
	public void outCan(String name) {
		for(int i=0;i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("��û�Ͻ�"+can[i].getCanName()+"��(��) �����ϼ̽��ϴ�.");
				System.out.println("�ܾ�"+(money-can[i].getPrice()+"�� �Դϴ�."));
			}
		}
				
	}
	
	

}
