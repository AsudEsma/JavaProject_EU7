package classes.day24_arrays;

public class Array {

	public static void main(String[] args) {

		int[] myList = {10, 20, 30, 44, 56, 69};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		System.out.println(myList[4]);
		System.out.println(myList[5]);
		
		String[] myArray = {"Amazon", "Ampul", "Kaval", "Kibar"};
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);

		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		int[] scores = {80,90,100,35,60,72,64,30,10,5,3,99,89};
		int avgScore = 0;
		for(int i=0; i<scores.length; i++) {
			avgScore+=scores[i];
		}
		
		System.out.println("Avarage score is: " + avgScore/scores.length);
		
	}

}
