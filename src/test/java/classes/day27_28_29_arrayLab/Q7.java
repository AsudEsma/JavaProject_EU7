 package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {};
		
		int[] a = {7,4,6,2};
		int[] b = {};
		
		int[] c = {58,69,325,258,488,658,12,174,14,325,1};
		int[] d = {};
		
		System.out.println(Arrays.toString(copyCat(x, y)));
		System.out.println(Arrays.toString(copyCat(a, b)));
		System.out.println(Arrays.toString(copyCat(c, d)));
	}
	
	public static int[] copyCat(int[] array1, int[] array2) {
		array2 = new int[2];
		array2[0] = array1[0];
		array2[1] = array1[array1.length-1];
		
		return array2;
	}

}
