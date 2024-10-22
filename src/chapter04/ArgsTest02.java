package chapter04;

public class ArgsTest02 {

	public static void main(String[] args) {
		// 배열의 기본 문법1
		int a[]=new int[5];
		
		// 배열의 기본 문법2
		int[] b; 
		//......
		b=new int[5];
		
		//main에서 주는 매개변수 활용
		//String args[];
		args=new String[2];
		args[0]="10"; //[0]:첨자, 인덱스 / "0" 요소
		args[1]="20";
		String sum=args[0]+args[1];
		System.out.println("문자열 병합: "+sum);
		System.out.println();
		
		String[] str;
		str=new String[10];
		
		int aVal;
		int bVal;
		
		if(args.length==2) {
			aVal=Integer.parseInt(args[0]); //10
			bVal=Integer.parseInt(args[1]);	//20
		}else {
			aVal=0;
			bVal=0;
		}
		System.out.println("------------");
		int Total=aVal+bVal;
		System.out.println("산술연산: "+Total);
		

	}

}
