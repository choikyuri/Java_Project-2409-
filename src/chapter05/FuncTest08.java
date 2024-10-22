package chapter05;

public class FuncTest08 {

	public static void main(String[] args) {
		
		int num = 10;
        System.out.println("Before: " + num);
        changeValue(num); //Call by Value(값으로 전달되는 방식)
        System.out.println("After: " + num);
	}
	
	 public static void changeValue(int value) {
		 value=20; //valuer값은 num이라는 매개변수의 복사본이므로 원본과는 상관이 없음
	 }
}
