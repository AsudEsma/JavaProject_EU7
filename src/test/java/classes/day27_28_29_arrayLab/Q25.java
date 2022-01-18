package classes.day27_28_29_arrayLab;

public class Q25 {
	
	public static void main(String[] args) {
		
		int[] x = {1,4,5,6,2};
		int[] y = {1,2,3};
		int[] z = {1,2,4,5,8,9};
		
		System.out.println(increasing3(x));
		System.out.println(increasing3(y));
		System.out.println(increasing3(z));
	}
	
	public static boolean increasing3 (int[] x) {
		for(int i=0; i<x.length-2; i++) {
			if(x[i]==x[i+1]-1 && x[i]==x[i+2]-2) {
				return true;
			}
		}
		
		return false;
	}

}
