package chapter05;

public class MethodTest02 {

	public static void main(String[] args) {
		
		String name=" 최백설";
		greet(name);//매개변수가 있는 메소드
	}
	
	public static void greet(String irum) {
		System.out.println("Hello,"+irum+"!");
	}
	
}
