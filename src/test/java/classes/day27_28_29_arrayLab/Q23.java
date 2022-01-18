package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q23 {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fizzArray(4)));
		System.out.println(Arrays.toString(fizzArray(1)));
		System.out.println(Arrays.toString(fizzArray(10)));
	}
	
	public static int[] fizzArray(int x) {
		
		int[] array = new int[x];
		for(int i=0; i<x; i++) {
			array[i] = i;
		}
		
		return array;
	}

}
