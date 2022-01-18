package assignments.ReplitAnswers;

import java.util.Scanner;

public class CaffeineOverDose {

	  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE:
		    
		    int numOfMilligrams, deathDose;
		    
		    Scanner scan = new Scanner(System.in);

		    System.out.println("Enter number of milligrams in drink:");
		    numOfMilligrams = scan.nextInt();
		    scan.close();
		    
		    deathDose = (10*1000) / numOfMilligrams;
		    System.out.println("It would take about " + deathDose + " drinks for a lethal overdose. - ");
		    
		    		    
		  }
}
