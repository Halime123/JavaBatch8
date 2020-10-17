package com.syntax.class03;

public class CompoundOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		num=num+10;
		System.out.println(num);
		
		num=num+200;
		System.out.println(num);
		
		int myNumber=100;
		myNumber+=10;
		System.out.println(myNumber);
		
		myNumber+=200;
		System.out.println(myNumber);
		myNumber/=10;
		System.out.println(myNumber);
		
		double d=12.9;
		
		/*
		 * 1. Declare variable and increase by 100 using shorthand operator
2. Declare variable and decrease by 67 using shorthand operator
3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
4. Declare variable cakePiece=25 and divide cakePiece between 7 people . Using shorthand operator 
found out how
 many pieces of cake left after it was distributed equally among 7 people
		 */
		
		int a=100;
		a-=67;
		int cakePiece=11;
		cakePiece/=4;
		int cakePiece1=25;
		cakePiece1/=7;
		System.out.println(cakePiece1-cakePiece);
		
		
		double f=12/7;
		System.out.println(f);
		
		double g=9;
		System.out.println(g);
		
		int i=(int)9.99;//bigger value into small box will fit only 9. Not decimals.Narrowing
		System.out.println(i);
		
		byte t=(byte)130; //narrowing
		System.out.println(t);
		
		double w=12.0/7.0;
		System.out.println(w);
		
		
		
		
		
		
		
		
			
		

	}

}
