package assignments.ReplitAnswers;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		//WRITE YOUR CODE HERE
		
		int[] arr2 = new int[2];
		if(num.length>2) {
			for(int i=0; i<arr2.length; i++) {
				arr2[i] = num[i];
			}
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println(Arrays.toString(num));
		}

	}
}
