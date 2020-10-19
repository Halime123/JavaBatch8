package com.syntax.class08;

public class Toplama {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<6; i++) {
			sum=sum+i;
			System.out.print(sum+" ");
		}
		System.out.println("--------");
		int mul;
		int b=2;
		for(int a=1; a<50; a++) {
			mul=b*a;
			System.out.print(mul+" ");
		}
		System.out.println("--------");
		
		int result=1;
		for (int i=10; i>=1; i-=2) {
			result*=i;
			System.out.println("result= "+ result);
		}
		
	}

}
