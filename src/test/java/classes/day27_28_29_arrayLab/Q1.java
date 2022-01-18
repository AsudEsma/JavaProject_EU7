package classes.day27_28_29_arrayLab;

public class Q1 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		
		System.out.println(has6(x));
		System.out.println(has6(y));
		System.out.println(has6(z));

	}

	public static boolean has6(int[] array) {
		
		if(array[0]==6 || array[array.length-1]==6) {
			return true;
		}
		
		return false;
	}
}
