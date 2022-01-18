package classes.day25_arrays;

import java.util.Random;

public class Task1_RandomArrayNumbers {

	public static void main(String[] args) {

		Random rn = new Random();
		
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rn.nextInt(100);
			System.out.println(numbers[i]);
		}

	}

}
