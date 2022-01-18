package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q30 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3}; int n = 2;
		int[] y = {1,2,3,2,5,2}; int m = 2;
		int[] z = {22,3,6,5,8,9,2,1,3,2,2,3,5,2,6,5,6,2}; int k = 2;
		
		System.out.println(Arrays.toString(leftAlone(x, n)));
		System.out.println(Arrays.toString(leftAlone(y, m)));
		System.out.println(Arrays.toString(leftAlone(z, k)));
	}
	
	public static int[] leftAlone(int[] arr, int a) {
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i]==a) {
				if(arr[i-1]!=a && arr[i+1]!=a) {
					if(arr[i-1]>arr[i+1]) {
						arr[i] = arr[i-1];
					} else {
						arr[i] =arr[i+1];
					}
				}
			}
		}
		
		return arr;
	}

}
