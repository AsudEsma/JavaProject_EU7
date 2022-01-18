package classes.day27_28_29_arrayLab;

public class Q22 {
	
	public static void main(String[] args) {
		
		int[] x = {1,4,1};
		int[] y = {1,4,1,4};
		int[] z = {1,1};
		
		System.out.println(compare1s4s(x));
		System.out.println(compare1s4s(y));
		System.out.println(compare1s4s(z));
	}
	
	public static boolean compare1s4s (int[] x) {
		
		int count1 = 0;
		int count4 = 0;
		
		for(int each : x) {
			if(each==1) {
				count1++;
			} else if (each==4) {
				count4++;
			}
		}
		
		return (count1>count4);
		
	}

}
