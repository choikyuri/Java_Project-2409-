package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 2명 생성(studentJames, studentTom)
		StdInfo studentJames = new StdInfo("James", 15000);
		StdInfo studentTom = new StdInfo("Tom", 12000);

		// 버스타기(100)
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);// 13600
		// James 정보보기
		studentJames.showinfo();
		bus100.showinfo();
		System.out.println("==================================");
		// 버스타기(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		studentTom.takeBus(bus100);
		studentTom.showinfo();
		bus999.showinfo();
		System.out.println("==================================");
        		
		//지하철 타기
		Subway subwayGreen=new Subway("2호선");
		studentTom.takeSubway(subwayGreen);
		//정보확인
		studentTom.showinfo();
		subwayGreen.showInfo();
		
		System.out.println("==================================");
		Subway subwayOrange=new Subway("3호선");
		studentJames.takeSubway(subwayOrange);
		studentJames.showinfo();
		subwayOrange.showInfo();
		
		

	}

}
