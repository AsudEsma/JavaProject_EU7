package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_HamletLogic {

	class Main {
		  public static boolean hamletQuote(boolean toBe,boolean notToBe){
		      // your code here
			  boolean hamletQuote = false;
			  if (toBe==false && notToBe==false) {
				  hamletQuote = false;
			  } else {
				  hamletQuote = true;
			  }
			  return hamletQuote;
		    
		  }

		  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
			System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
			in.close();
		  }
		}
}