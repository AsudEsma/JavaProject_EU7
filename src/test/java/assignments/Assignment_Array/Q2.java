package assignments.Assignment_Array;

public class Q2 {
	
	public static void main(String[] args) {
		
		int[] nums10 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<nums10.length; i++) {
			nums10[i] = 19*(i+1);
		}
		
		for(int i=0; i<nums10.length; i++) {
			int num = nums10[i];
			System.out.println(num);
		}
	
	
	}

}
