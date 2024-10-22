package chapter02;

public class ArithTest01 {

	public static void main(String[] args) {
		// ÃÑÁ¡°ú Æò±Õ
		
		int mathScore=96;
		int engScore=87;
		
		//ÃÑÁ¡
		System.out.println("ÃÑÁ¡ : "+(mathScore+engScore));
		//Æò±Õ
		System.out.println("Æò±Õ : "+(mathScore+engScore)/2);
		System.out.println("----------------");
		
		System.out.println("Æò±Õ : " + ((mathScore + engScore) / 2.0));
		System.out.println("Æò±Õ : "+(mathScore+engScore)/2f);
		System.out.println("Æò±Õ : " +(double) (mathScore+engScore)/2);
		System.out.println("----------------");
		
		double total=mathScore+engScore;
		System.out.println("ÃÑÁ¡ : "+total);
		
		double average=total/2;
		System.out.println("Æò±Õ : "+average);

	}

}
