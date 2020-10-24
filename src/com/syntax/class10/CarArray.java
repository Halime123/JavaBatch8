package com.syntax.class10;

public class CarArray {

	public static void main(String[] args) {
		
		String car[]= {"Honda"+"Toyota"+"BMW"+"Mercedes"+"Lexus"};
		
		
		for(int i=0;i<car.length;i++) {
			System.out.println(car[i]+" ");
			
			
		}
		System.out.println();
		for(String cars:car) {
			System.out.println(cars);
			
			
		}
		int[] numbers= {10,40,80};
		for(int num:numbers) {
			System.out.println(num);
		}
		

	}

}
