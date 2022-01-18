package classes.day27_arrays;

import java.util.Arrays;

public class Length {

	public static void main(String[] args) {

		int[][] numbers = {
				{1,2,3,4},
				{5,6},
				{9,10,11,23,30,50,60}
		};
		
		System.out.println("The number of rows is " + numbers.length);
		System.out.println("The first row has " + numbers[0].length + " numbers inside.");
		System.out.println("And the numbers are: ");
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println("The second row has " + numbers[1].length + " numbers inside.");
		System.out.println("And the numbers are: ");
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println("The third row has " + numbers[2].length + " numbers inside.");
		System.out.println("And the numbers are: ");
		System.out.println(Arrays.toString(numbers[2]));
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Number of coloums in #" + (i+1) + " is " + numbers[i].length);
		}
		
		for(int i=0; i<numbers[2].length; i++) {
			System.out.println("The #" + (i+1) + " number is " + numbers[2][i]);
		}
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
	}

}
