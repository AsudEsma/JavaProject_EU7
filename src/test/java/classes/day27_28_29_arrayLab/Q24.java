package classes.day27_28_29_arrayLab;

public class Q24 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,1,3};
		int a = 2;
		
		int[] y = {1,2,1,3};
		int b = 1;
		
		int[] t = {1,2,1,3,9,8,9,6,5,4};
		int c = 9;
		
		System.out.println(isEverywhere(x, a));
		System.out.println(isEverywhere(y, b));
		System.out.println(isEverywhere(t, c));
	}

	public static boolean isEverywhere (int[] x, int num) {
		for(int i=0; i<x.length-2; i++) {
			if(x[i]==num && (x[i+1]==num || x[i+2]==num)) {
				return true;
			}
		}
		
		return false;
		
	}
}
