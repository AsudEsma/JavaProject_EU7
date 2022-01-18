package classes.day23_Practice;

import java.util.Random;

public class Task2_HeadsOrTails {

	public static void main(String[] args) {

		Random rn = new Random();
		int countH = 0, countT = 0;
		
		for(int i=1; i<=10; i++) {
			int a = rn.nextInt(2);
			
			if(a==0) {
				System.out.println("Heads");
				countH++;
			} else {
				System.out.println("Tails");
				countT++;
			} 
		
		}
		
		System.out.println("Heads: " + countH);
		System.out.println("Tails: " + countT);
	}

}
