package classes.day27_28_29_arrayLab;

public class Q8 {
	
	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		int[] q = {1,3,6,9,25,47,58,69};
		
		System.out.println(cont2or3(x));
		System.out.println(cont2or3(y));
		System.out.println(cont2or3(z));
		System.out.println(cont2or3(q));
	}
	
	public static boolean cont2or3(int[] array) {
		for(int value : array) {
			if(value==2 || value==3) {
				return true;
			}
		}
		
		return false;
	}

}
