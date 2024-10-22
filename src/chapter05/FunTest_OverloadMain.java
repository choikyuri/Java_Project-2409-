package chapter05;

public class FunTest_OverloadMain {
	
	
	public static void main(String[] args) {
		
		//FunTest_Overload obj
		FunTest_Overload obj=new FunTest_Overload();
		
		obj.getResult(4);
		obj.getResult('A');
		obj.getResult("월요일 입니다.");
		obj.getResult(3, "2024");
		
	}
	
}
