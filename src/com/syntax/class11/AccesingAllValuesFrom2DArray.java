package com.syntax.class11;

import java.lang.reflect.Array;

public class AccesingAllValuesFrom2DArray {

	public static void main(String[] args) {
		char[][] $array=new char[3][4];
		
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='V';
		$array[2][3]='R';
		
		System.out.println($array.length);
		
		for(int row=0; row<$array.length; row++) {
			
			for(int c=0; c<$array[row].length; c++) {
				
				System.out.print($array[row][c]+" ");
			}
			System.out.println();
			
			
		}
		System.out.println("---------------------");
		
		int[][]array= {
				{10,20,30},
				{1,2,3},
				{100,200,300} };
		
		for (int i=0; i<array.length;i++) {
			
			for (int j=0; j<array[i].length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		}
		

	}


