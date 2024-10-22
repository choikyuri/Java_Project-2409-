package chapter05;

public class MethodMain {

	public static void main(String[] args) {
		
		Method bread=new Method();
		
		bread.makeBread();
        System.out.println();
		bread.order();//void makeBread(int cnt), void makeBread(int count, String name) 

	}

}
