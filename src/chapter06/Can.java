package chapter06;

public class Can {

	// 멤버변수
	private String canName;
	private int price;
	
	//생성자를 통하여 멤버변수 초기화
	public Can(String canName, int price) {
		this.canName = canName;
		this.price = price;
	}
	
    //getters setters
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	

}
