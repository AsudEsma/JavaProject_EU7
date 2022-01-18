package classes.day27_arrays;

public class RaggedArray {

	public static void main(String[] args) {
	
		int[][] array = new int[4][];
		
		System.out.println(array[0]); // "null" because you haven't assigned anything in the #0 array.
									  // it would print the address normally.
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];
		
		System.out.println(array[0]); // Just like here.
		
		// This is the same with the following version:
		
		int[][] array2 = {{0,0,0}, {0,0,0,0},{0,0,0,0,0},{0,0}};
		
		System.out.println(array2[0][0]);

	}

}
