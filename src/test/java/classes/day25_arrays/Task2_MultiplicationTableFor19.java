package classes.day25_arrays;

import java.util.Arrays;

public class Task2_MultiplicationTableFor19 {

	public static void main(String[] args) {

		int[] table = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<table.length; i++) {
			System.out.println(table[i]*19);
		}
		
		System.out.println(Arrays.toString(table));
		System.out.println();
		
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
			System.out.println(numbers[i]);
		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
