package chapter04;

public class ArgsTest01 {

	public static void main(String[] args) {
		//배열
		//int numbers[]=new int[5];
		int[] numbers=new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
				
		for(int i=0;i<numbers.length;i++) {
			System.out.println(i+" 번 요소: "+numbers[i]);
		}
		System.out.println("numbers의 갯수: "+numbers.length+"개");
	}
}
