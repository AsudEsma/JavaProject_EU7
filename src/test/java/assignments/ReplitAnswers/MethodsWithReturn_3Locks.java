package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_3Locks {

	  public static boolean threeLocks(boolean a, boolean b, boolean c) {
		    boolean threeLocks=false;
		    if (a==true && b==true || c==true) {
		    	threeLocks = true;
		    }
		    return threeLocks;
		    
	  }//end threeLocks

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
		in.close();
		
	  }
	}
