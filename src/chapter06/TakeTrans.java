package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// �л� 2�� ����(studentJames, studentTom)
		StdInfo studentJames = new StdInfo("James", 15000);
		StdInfo studentTom = new StdInfo("Tom", 12000);

		// ����Ÿ��(100)
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);// 13600
		// James ��������
		studentJames.showinfo();
		bus100.showinfo();
		System.out.println("==================================");
		// ����Ÿ��(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		studentTom.takeBus(bus100);
		studentTom.showinfo();
		bus999.showinfo();
		System.out.println("==================================");
        		
		//����ö Ÿ��
		Subway subwayGreen=new Subway("2ȣ��");
		studentTom.takeSubway(subwayGreen);
		//����Ȯ��
		studentTom.showinfo();
		subwayGreen.showInfo();
		
		System.out.println("==================================");
		Subway subwayOrange=new Subway("3ȣ��");
		studentJames.takeSubway(subwayOrange);
		studentJames.showinfo();
		subwayOrange.showInfo();
		
		

	}

}
