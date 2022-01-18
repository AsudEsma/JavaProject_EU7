package classes.day27_28_29_arrayLab;

public class Q10 {

	public static void main(String[] args) {

		int[] x = {2,2};
		int[] y = {3,3};
		int[] a = {2,3};
		int[] b = {12,20,42};
		int[] c = {2,2,2};
		
		System.out.println(twice2or3(x));
		System.out.println(twice2or3(y));
		System.out.println(twice2or3(a));
		System.out.println(twice2or3(b));
		System.out.println(twice2or3(c));

	}
	
	public static boolean twice2or3(int[] array) {
		int counter2 = 0;
		int counter3 = 0;
		for(int each : array) {
			if(each==2) {
				counter2++;
			} else if(each==3) {
				counter3++;
			}
		}
		
		if(counter2==2 || counter3==2) {
			return true;
		} else {
			return false;
		}
	}

}
