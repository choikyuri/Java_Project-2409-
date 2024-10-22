package chapter05;

class MyObject{
	
	//멤버변수
	int value;
    
	//생성자
	public MyObject(int value) {
		this.value = value;
	}
	
}//MyObject class


public class FuncTest09 {
	
	public static void main(String[] args) {
		
		//MyObject obj
		MyObject obj=new MyObject(10);
		
        System.out.println("Before: " + obj.value); //10
        changeValue(obj); //Call by Reference
        System.out.println("After: " + obj.value); //20
	}
	 //참조형 메서드
	 public static void changeValue(MyObject object) {
		 object.value=20;
	 }
}
