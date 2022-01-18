package assignments.ReplitAnswers;

import java.util.Scanner;

public class MergeThem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		//YOUR CODE HERE
		String merged = "";
		if(word1.length()==3 && word2.length()==3) {
			for(int i=0; i<3; i++) {
				merged+=word1.charAt(i)+""+word2.charAt(i);
			}
			
			System.out.println(merged);
			
		} else {
			System.out.println("cannot merge");
		}
		    
		scan.close();    
	}
}
