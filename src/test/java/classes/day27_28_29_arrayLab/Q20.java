package classes.day27_28_29_arrayLab;

public class Q20 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1,2,1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(twoAfterTwo(x));
		System.out.println(twoAfterTwo(y));
		System.out.println(twoAfterTwo(a));
		System.out.println(twoAfterTwo(b));
	}
	
	public static boolean twoAfterTwo(int[] x) {
		boolean twoAfterTwo = false;
		for(int i=0; i<x.length-1; i++) {
			if(x[i]==2 && x[i+1]==2) {
				twoAfterTwo = true;
			}
		}
		
		return twoAfterTwo;
	}
}
