package chapter05;

public class MethodTest03 {

	public static void main(String[] args) {
		
		int result = add(5,7); //실매개변수
		System.out.println("Result : "+ result);

	}
	
	public static int add(int a, int b) {//int a=5, int b=7
		return a+b;
	}
	
	

}
