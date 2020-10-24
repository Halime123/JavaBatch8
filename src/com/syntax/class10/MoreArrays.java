package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		for(int i=0;i<grades.length;i++) {
			char valueFromArray=grades[i];
			System.out.println(valueFromArray);
			
			
		}
		
	}

}
