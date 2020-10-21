package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		int a=10;
		int [] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		System.out.println("Accessing 3 element "+num[2]);
		System.out.println(num[2]+num[3]);
		num[4]=100;
		System.out.println("Value of the 5th element after change "+num[4]);
		
		int[]array=new int[2];
		array[0]=(int)10.99;
		
		
		

	}
}
