package chapter05;

public class Example02 {
	
	/*두 정수를 입력받아서(=매개변수) 그 합을 계산하는 메소드를 구현해보세요.*/
	private static int sum1(int a, int b) {
		//int hap=a+b;
		//return hap;
		return a+b;
	}
	
	public static void sum2(int a, int b) {
		System.out.println("void메서드에서 출력 "+(a+b));
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		//반환값이 있는 메서드 
		int result=sum1(num1, num2);
		System.out.println("반환값 출력: "+result);
		
		//반환값이 없음
		sum2(num1, num2);

	}

}
