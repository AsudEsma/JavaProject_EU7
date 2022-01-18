package classes.day27_28_29_arrayLab;

public class Q16 {
	
	public static void main(String[] args) {
		
		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0};
		int[] z = {1,3,5};
		
		System.out.println(evens(x));
		System.out.println(evens(y));
		System.out.println(evens(z));
	}
	
	public static int evens(int[] arr) {
		
		int count = 0;
		for(int each : arr) {
			if(each%2==0) {
				count++;
			}
		}
		
		return count;
	}

}
