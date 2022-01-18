package assignments.ReplitAnswers;

public class SimplePrintPattern {

	  public static void printHollowRect(){
		    // write your codes here
		  for (int i=1; i<=5; i++) {
			  
			  if (i==1 || i==5) {
				  for (int j=1; j<=5; j++) {
					  System.out.print("*");
				  }
			  } else {
				    for (int j=1; j<=5; j++) {
				    	if (j==1 || j==5) {
				    		System.out.print("*");
				    	} else {
				    		System.out.print(" ");
				    	}
				    }
			  }
			  System.out.println();
		  }
	  }
		    
		  
		  public static void main(String[] args) {
		    printHollowRect();
		  }

		}
