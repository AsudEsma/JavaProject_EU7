package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {11,5,9};
		int[] z = {110,5,98,0,1200,11,-4};
		
		greaterValue(x);
		greaterValue(y);
		greaterValue(z);

		greaterValue2(x);
		greaterValue2(y);
		greaterValue2(z);
	}
	
	public static void greaterValue(int[] array) {
		
		int greater = array[0];
		
		for(int i=0; i<array.length-1; i++) {
			if (array[i+1] > greater) {
				greater = array[i+1];
			}
		}
		
		for(int i=0; i<array.length; i++) {
			array[i] = greater;
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void greaterValue2(int[] array) {
		Arrays.sort(array);
		int greater = array[array.length-1];
		
		for(int i=0; i<array.length-1; i++) {
			array[i] = greater;
		}
		
		System.out.println(Arrays.toString(array));
	}

}
