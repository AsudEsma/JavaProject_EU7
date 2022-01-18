package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q11 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] w = {11,2,13,3,2};
		
		System.out.println(Arrays.toString(followedBy3(x)));
		System.out.println(Arrays.toString(followedBy3(y)));
		System.out.println(Arrays.toString(followedBy3(z)));
		System.out.println(Arrays.toString(followedBy3(w)));
	}
	
	public static int[] followedBy3 (int[] array) {
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==2 && array[i+1]==3) {
				array[i+1]=0;
			}
		}
		
		return array;
	}

}
