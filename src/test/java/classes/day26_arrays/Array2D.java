package classes.day26_arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] scores = new int[2][];
		System.out.println(scores);
		System.out.println(scores[0]); // null because the scond [] is empty.
		
		int[][] score = new int[3][4];
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[1]);
		
		// Printing the first row
		System.out.println(score[0][0]);
		System.out.println(score[0][1]);
		System.out.println(score[0][2]);
		System.out.println(score[0][3]);
		// Printing the second row
		System.out.println(score[1][0]);
		System.out.println(score[1][1]);
		System.out.println(score[1][2]);
		System.out.println(score[1][3]);
		// Printing the third row
		System.out.println(score[2][0]);
		System.out.println(score[2][1]);
		System.out.println(score[2][2]);
		System.out.println(score[2][3]);
		
		// Assigning the first row
		score[0][0] = 10;
		score[0][1] = 20;
		score[0][2] = 30;
		score[0][3] = 40;
		// Assigning the second row
		score[1][0] = 50;
		score[1][1] = 60;
		score[1][2] = 70;
		score[1][3] = 80;
		// Assigning the third row
		score[2][0] = 90;
		score[2][1] = 100;
		score[2][2] = 110;
		score[2][3] = 120;
		
		// Printing the first row
		System.out.println("First Row:");
		System.out.println(score[0][0]);
		System.out.println(score[0][1]);
		System.out.println(score[0][2]);
		System.out.println(score[0][3]);
		// Printing the second row
		System.out.println("Second Row:");
		System.out.println(score[1][0]);
		System.out.println(score[1][1]);
		System.out.println(score[1][2]);
		System.out.println(score[1][3]);
		// Printing the third row
		System.out.println("Third Row:");
		System.out.println(score[2][0]);
		System.out.println(score[2][1]);
		System.out.println(score[2][2]);
		System.out.println(score[2][3]);		
		
		
	}

}
