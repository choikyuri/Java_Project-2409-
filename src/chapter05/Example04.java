package chapter05;

import chapter06.SungJuk;

public class Example04 {
	
	public double calculateAverage(int[] array) {//{5,10,15,20,25}
		
		int sum=0;
		/*
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}*/
		
		for(int num:array) {
			sum+=num;
		}
		
		double avg=(double)sum/array.length;
		
		return avg;
		
	}

	public static void main(String[] args) {
		
		Example04 calculator=new Example04();
	
		int[] numbers= {5,10,15,20,25};
		double average=calculator.calculateAverage(numbers);	
		System.out.println("¹è¿­ÀÇ Æò±Õ: "+average);	
	}

}
