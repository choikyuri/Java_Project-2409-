package chapter05;

public class FunTest_Overload {

	// 멤버변수=필드=속성

	// 생성자(디폴트 생략)

	// 오버로딩(메서드의 매개변수를 다르게 하여 같은 명칭의 메서드 생성)
	public void getResult(int n) {
      System.out.println(n + "은(는) int 입니다.");
	}

	public void getResult(char n) {
		System.out.println(n + "은(는) char 입니다.");
	}

	public void getResult(String n) {
		System.out.println(n + "은(는) String 입니다.");
	}

	public void getResult(int n, String str) {
		System.out.println(n + "은(는) int 이고, "+str+"은(는) String 입니다.");
	}
}
