package classes.day40_accessModifiers_hiding;

public class FinalArray {

	public static void main(String[] args) {
		
		final int[] TEAMS = {11, 11};
		System.out.println(TEAMS[0]);
		
		TEAMS[0] = 15;
		TEAMS[1] = 22;
		System.out.println(TEAMS[0]);
		System.out.println(TEAMS[1]);
		
		// If an OBJ is final, you cannot change the reference of it.
		// But you can chance the inside of the OBJ.
		
		int nums[] = new int[] {20,20,40};
		nums = new int[] {10,15,100};
		
		// We changed the reference and create a new OBJ.
		
		final int[] finalnums = new int[] {23,66,44};
		finalnums[0] = 120;
		//finalnums = new int[] {1,2,3,4};
		
		// You cannot change the reference and create a new OBJ if your OBJ is FINAL.
		// But you can chance the inside of the OBJ.
	}
	
	
}
