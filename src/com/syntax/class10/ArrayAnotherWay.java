package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		String[] names= {"Mike","Burcu","Danilo","Bryan"};
		System.out.println(names[3]);
		int size=names.length;
		System.out.println(size);
		System.out.println(names[names.length-2]);
		int a=2;
		System.out.println(names[a]);
		
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
			
		}

	}

}
