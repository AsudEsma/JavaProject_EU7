package classes.day27_28_29_arrayLab;

public class Q21 {
	
	public static void main(String[] args) {
		
		int[] x = {2,3,2,2,4,2};
		int[] y = {2,3,2,2,4,2,2};
		int[] z = {1,2,3,4};
		int[] t = {25,36,9,5,88,42,2};
		
		System.out.println(eightDetector(x));
		System.out.println(eightDetector(y));
		System.out.println(eightDetector(z));
		System.out.println(eightDetector(t));
	}
	
	public static boolean eightDetector(int[] x) {
		
		int sum = 0;
		for(int each : x) {
			if(each==2) {
				sum += each;
			}
		}
		
		if(sum==8) {
			return true;
		} else {
			return false;
		}
	}

}
