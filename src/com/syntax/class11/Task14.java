package com.syntax.class11;

public class Task14 {

	public static void main(String[] args) {
		int largest=0;
		int smallest=0;
		int[] arr= {0, 10, 20, 8, -1, 77, 56,};
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>largest) {
			largest=arr[i];
			
				
			} else if(arr[i]<smallest) {
				smallest=arr[i];
				System.out.println("The smallest number is "+smallest);
			}
			
		}
		System.out.println("The largest number is  "+largest);

	}

}
