package chapter01;

public class ExplicitConversion12 {

	public static void main(String[] args) {
		// 명시적 형변환(캐스팅)
		int iNum=1000;
		byte bNum=(byte)iNum; //-128 ~ 127 
		
		System.out.println(iNum);
		System.out.println(bNum); //유실된 결과값(손실)
		System.out.println("--------------------------");	
		
		double dNum1=1.2; //8byte
		float fNum1=0.9f; //4byte
		
		int iNum2=(int)(dNum1+fNum1); //1.2+0.9=2.1 => 2
		int iNum3=(int)dNum1+(int)fNum1; // 1+0=1
		
		System.out.println(iNum2);//2
		System.out.println(iNum3);//1
		
		
	}

}
