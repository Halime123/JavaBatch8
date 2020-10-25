package com.syntax.class11;

public class Task22D {

	public static void main(String[] args) {
		
	
		String [][] cars= {
				{"ford","gmc"},
				{"mercedes","audi"},
				{"kia","hyundai"},
				{"alfaRomeo","maserati"}
				};
		
		for(int  row=0;row<cars.length;row++) {
			for(int col=0;col<cars[row].length;col++) {
				System.out.print(cars[row][col]+" ");
			}
			System.out.println();

	}
		System.out.println("-----------");
		for(String[] carArray:cars) {
			for (String car:carArray) {
				System.out.print(car+" ");
			}
			System.out.println();
			
		}

}
	
}
