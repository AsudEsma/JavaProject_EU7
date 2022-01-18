package classes.day27_arrays;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {

		String[][] pizzas = {
				
				{"pinneapple","pepperoni"}, //row-0
				{"anchovies","mushroom","olives"}, //row-1
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
		
		System.out.println(Arrays.deepToString(pizzas[0]));

		for(String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("FOR ITERATION LOOP");
		for(int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length);
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for(String value : pizzas[3]) {
			System.out.println(value);
		}
		
		int[][] students = {{4,5,6}, {12,5,7}, {23,56,12,55,3}};
		
		for(int[] group : students) {
			for(int studentID : group) {
				System.out.println(studentID);
			}
		}
		
		for(int[] group : students) {
			System.out.println(Arrays.toString(group));
		}
		
	}

}
