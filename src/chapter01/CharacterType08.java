package chapter01;

public class CharacterType08 {

	public static void main(String[] args) {
		// Java에서 Char : 2byte(16bit) => 유니코드(UTF-16)
		// C, C++, C#에서 Char : 1바이트(8bit) 
		
		char ch1='한';
		char ch2='\uD55C';
		
		char str1='A';		
		String str2="Hello Java";
		String str3="W";
		String str4="Welcome to Java";
		
		System.out.println("ch1: "+ch1);
		System.out.println("ch2: "+ch2);
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println("str4: "+str4);
		
		

	}

}
