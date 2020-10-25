package com.syntax.class11;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		String [][] food= {
				{"hamburger","sandiwich","steak"},
				{"pizza","pasta","canoli","dumplings"},
				{"noodles","sticky rice","ramen"},
				{"kebab", "manto"},
				{"Beryani","masala","chicken tikka masala", "curry"},
				
		};
		for(String[] dishes:food) {
			for(String dish :dishes) {
				System.out.print(dish+"  ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		for(int i=0; i<food.length; i++) {
			for(int j=0; j<food[i].length;j++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}

	}

}
