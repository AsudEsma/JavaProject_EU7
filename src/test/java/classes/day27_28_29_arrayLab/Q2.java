package classes.day27_28_29_arrayLab;

public class Q2 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		firstAndTheLast(x);
		firstAndTheLast(y);
		firstAndTheLast(z);
		firstAndTheLast(k);
		
	}

	public static void firstAndTheLast(int[] array) {

		if(array.length<=1) {
			System.out.println("Not a valid array.");
		} else {
			if(array[0]==array[array.length-1]) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
