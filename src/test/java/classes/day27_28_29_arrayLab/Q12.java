package classes.day27_28_29_arrayLab;

public class Q12 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,3};
		
		int[] a = {7,2,3};
		int[] b = {1};
		
		int[] c = {3,2,4};
		int[] d = {4,3,4};
		
		System.out.println(firstElement(x, y));
		System.out.println(firstElement(a, b));
		System.out.println(firstElement(c, d));
	}
	
	public static int firstElement(int[] array1, int[] array2) {
		
		int counter = 0;
		if(array1[0] == 1) {
			counter++;
		}
		
		if (array2[0] == 1) {
			counter++;
		}
		
		return counter;
	}
}
