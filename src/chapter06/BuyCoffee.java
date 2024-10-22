package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//고객2명 생성(kim 12000원, park 10000원)
		Customer Kim = new Customer("Kim",12000);
		Customer Park = new Customer("Park",10000);
		
		//카페 생성(카페객체이름 -> 힘이나는 커피)
		Cafe cafeA=new Cafe("힘이나는 커피");
		
		//카페방문(힘이나는 커피 -> Kim 4000 / park 4500)
		Kim.visitCafe(cafeA, 4000);
		Park.visitCafe(cafeA, 4500);
		
		//카페정보
		cafeA.showInfo();
		//고객들의 정보
        Kim.showInfo();
        Park.showInfo();
	}

}
