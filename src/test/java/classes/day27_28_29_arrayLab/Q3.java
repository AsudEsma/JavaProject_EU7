package classes.day27_28_29_arrayLab;

public class Q3 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {7,3};
		
		int[] x1 = {1,2,3};
		int[] y1 = {7,3,2};
		
		int[] x2 = {1,2,3};
		int[] y2 = {1,3};
		
		int[] x3 = {1};
		int[] y3 = {7,3};
		
		int[] x4 = {1,2,3};
		int[] y4 = {1};
		
		int[] x5 = {5};
		int[] y5 = {9};
		
		arrayComp(x,y);
		arrayComp(x1,y1);
		arrayComp(x2,y2);
		arrayComp(x3,y3);
		arrayComp(x4,y4);
		arrayComp(x5,y5);
		
	}
	
	public static void arrayComp(int[] array1, int[] array2) {
		if(array1.length<=1 || array2.length<=1) {
			if(array1.length>array2.length) {
				System.out.println("Array2 is not a valid array.");
			} else if(array1.length<array2.length) {
				System.out.println("Array1 is not a valid array.");
			} else {
				System.out.println("Both Array1 and Array2 are not valid arrays.");
			}
		} else {
			if(array1[0]==array2[0] || array1[array1.length-1]==array2[array2.length-1]) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
