package classes.day27_28_29_arrayLab;

public class Q19 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1,2,2,6,99,99,7};
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2};
		int[] c = {1,2,2,6,99,99,7,3,4};
		
		System.out.println(sumWithout6and7(x));
		System.out.println(sumWithout6and7(y));
		System.out.println(sumWithout6and7(a));
		System.out.println(sumWithout6and7(b));
		System.out.println(sumWithout6and7(c));
	}
	
	public static int sumWithout6and7 (int[] arr) {
		int sum = 0;
		boolean checkSix = false;
		
		for(int i=0; i<arr.length; i++) {
			if(checkSix) {
				if(arr[i]==7) {
					checkSix = false;
				}
			} else if (arr[i]==6) {
				checkSix = true;
			} else {
				sum += arr[i];
			}
		}
		
		return sum;
	}
	
	
}
