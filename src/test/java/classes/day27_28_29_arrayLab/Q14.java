package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q14 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2}; int[] y = {3,4};
		int[] a = {4,4}; int[] b = {2,2};
		int[] c = {9,2}; int[] d = {3,4};
		int[] kali = {72,5,69,24,15,23,3}; int[] dali = {96,6,5,212,35};
		
		System.out.println(Arrays.toString(megaArr(x, y)));
		System.out.println(Arrays.toString(megaArr(a, b)));
		System.out.println(Arrays.toString(megaArr(c, d)));
		System.out.println(Arrays.toString(megaArr(kali,dali)));
	}
	
	public static int[] megaArr(int[] arr1, int[]arr2) {
		
		int[] megaArr = new int[arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			megaArr[i]=arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			megaArr[arr1.length+i]=arr2[i];
		}
		
		return megaArr;
	}

}
