package chapter07;

public class Encapsulation {
	
	private int Side;
	private int Height;
	
	public Encapsulation() {
		
	}
	
	public int Cal_Area(int s, int h) {
		
		Side=s;
		Height=h;
		
		return Side*Height;
		
	}

}
