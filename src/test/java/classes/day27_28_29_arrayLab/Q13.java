package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q13 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2}; int[] y = {3,4};
		int[] a = {5,6}; int[] b = {3,8};
		int[] c = {1,1}; int[] d = {1,0};
		int[] kali = {7,9,6,2,5,6,3,6,9,11}; int[] dali = {112,35};
		
		largestSum(x, y);
		largestSum(a, b);
		largestSum(c, d);
		largestSum(kali, dali);
	}
	
	public static void largestSum (int[] arr1, int[] arr2) {
		
		int sum1 = 0;
		int sum2 = 0;
		for (int each : arr1) {
			sum1+=each;
		}
		
		for (int each : arr2) {
			sum2+=each;
		}
		
		if(sum1==sum2) {
			System.out.println("equal");
		} else if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		} else {
			System.out.println(Arrays.toString(arr2));
		}
	}

}
