package classes.day27_28_29_arrayLab;

public class Q18 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2,1};
		int[] y = {1,1};
		int[] a = {1,2,2,1,13};
		int[] b = {1,2,2,1,13,3};
		int[] c = {13,2,2,1,11,3};
		
		System.out.println(sum(x));
		System.out.println(sum(y));
		System.out.println(sum(a));
		System.out.println(sum(b));
		System.out.println(sum(c));
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==13) {
				break;
			} else {
				sum += arr[i];
			}
			
		}
		
		return sum;
	}
	
}
