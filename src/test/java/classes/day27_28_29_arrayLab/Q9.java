package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {

		int[] x = {4,5,6};
		int[] y = {9,8,6,7};
		int[] z = {14,12,11};
		int[] a = {1};
		
		System.out.println(Arrays.toString(doubleArray(x)));
		System.out.println(Arrays.toString(doubleArray(y)));
		System.out.println(Arrays.toString(doubleArray(z)));
		System.out.println(Arrays.toString(doubleArray(a)));

	}
	
	public static int[] doubleArray(int[] array) {
		int[] dArray = new int[(array.length*2)];
		dArray[dArray.length-1] = array[array.length-1];
		
		return dArray;
	}

}
