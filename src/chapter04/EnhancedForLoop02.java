package chapter04;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40,50};
		
		for (int num : numbers) {
			System.out.print(num + " \n");
		}
		
		System.out.println("------------------------");
		
		int num[]= {5,10,15,20,25};
		int sum=0;
		
		for(int n:num) {
			System.out.print(n+" ");
			sum+=n;
		}
		System.out.println("\n«’∞Ë : "+sum);
		

	}

}
