package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q28 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fizzArray(5,10)));
		System.out.println(Arrays.toString(fizzArray(11,18)));
		System.out.println(Arrays.toString(fizzArray(1,3)));
	}
	
	public static int[] fizzArray(int a, int b) {
		
		int[] arr = new int[b-a];
		for(int i=a, j=0; i<b; i++,j++) {
			arr[j] = a+j;
		}
		
		return arr;
	}
}
