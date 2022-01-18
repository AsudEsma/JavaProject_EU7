package assignments.ReplitAnswers;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		scan.close();
		//WRITE YOUR CODE HERE
		boolean b = true;
		
		if(sizeOuter<sizeInner) {
			b = false;
		}
		for(int i=0; i<sizeInner; i++) {
			if(Arrays.binarySearch(outer, inner[i]) < 0) {
				b = false;
				break;
			}
		}
		
		System.out.println(b);
		
	}
}
