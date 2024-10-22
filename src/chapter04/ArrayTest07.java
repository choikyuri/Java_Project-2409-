package chapter04;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		char[] alpa=new char[26];//요소 없음 즉 초기하 안되어 있음
		char ch='A';//65
		/*
		for(int i=0;i<alpa.length;i++) {
			//alpa[i] += (ch+i); //alpa[i]=alpa[i]+(ch+i)
			alpa[i]=ch;
			ch++; // ch=ch+1 
			System.out.print("("+alpa[i]+")"+" ");	
		}//for
		*/
		for(int i=0;i<alpa.length;i++,ch++) {
			alpa[i]=ch;
			System.out.print("("+alpa[i]+", "+(int)(alpa[i])+")");	
		}//for

	}

}
