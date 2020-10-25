package com.syntax.class11;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
		
		int[] array= {0, 10, 20, 8, -1, 77, 56,};
		 
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}
			if (array[i]!=largest && array[i]>secondLargest) {
				secondLargest=array[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("There is no second largest number");
		} else {
			System.out.println("Second largest= "+secondLargest);
		}
		
		System.out.println("-------------------");
		
	
	}

}

