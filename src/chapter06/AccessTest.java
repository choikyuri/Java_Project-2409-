package chapter06;

public class AccessTest {
	
	//멤버변수=필드
	private int aa; //현재 클래스에서만 사용 가능
	public int bb; //접근지정자 공용(다른 클래스에서도 사용가능)
	int cc; //public 생략
	
	//디폴트 생성자
	
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값: "+aa+" bb값: "+bb+" cc값: "+cc);
	}

	public static void main(String[] args) {
		
		AccessTest obj=new AccessTest();
		
		//aa초기화 방법
		//obj.aa=10;
		//System.out.println("aa=10 -> "+obj.aa);
		obj.setAa(20);
		System.out.println("setAa(20) -> "+obj.aa);
		
		obj.setBb(30);
		System.out.println("setBb(30) -> "+obj.bb);
		
		obj.cc=40;
		System.out.println("obj.cc=40 -> "+obj.cc);
		
		obj.Disp();
		

	}

	

}
