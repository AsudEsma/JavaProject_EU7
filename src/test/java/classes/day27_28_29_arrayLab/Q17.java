package classes.day27_28_29_arrayLab;

public class Q17 {
	
	public static void main(String[] args) {
		
		int[] x = {10,3,5,6};
		int[] y = {7,2,10,9};
		int[] z = {2,10,7,2};
		int[] t = {115,69,5996,35,2,45,63};
		
		System.out.println(diff(x));
		System.out.println(diff(y));
		System.out.println(diff(z));
		System.out.println(diff(t));
		
	}
	
	public static int diff (int[] arr) {
		int biggest = arr[0];
		int smallest = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1] > biggest) {
				biggest = arr[i+1];
			}
			if(arr[i+1] < smallest) {
				smallest = arr[i+1];
			}
		}
		
		return biggest-smallest;
		
	}

}
