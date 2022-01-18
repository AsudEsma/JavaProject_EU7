package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {17,12,10,8};
		int[] z = {7,0,0};
		
		System.out.println(Arrays.toString(leftRotated(x)));
		System.out.println(Arrays.toString(leftRotated(y)));
		System.out.println(Arrays.toString(leftRotated(z)));

	}
	
	public static int[] leftRotated(int[] array) {
		
		int x = array[0];
		for(int i=0; i<array.length-1; i++) {
			array[i]=array[i+1];
		}
		
		array[array.length-1] = x;
		
		return array;
	}

}
