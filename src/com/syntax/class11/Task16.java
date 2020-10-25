package com.syntax.class11;

public class Task16 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 3 columns.
		//Print the sum of all numbers.
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				int sum=i+j;
				
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
