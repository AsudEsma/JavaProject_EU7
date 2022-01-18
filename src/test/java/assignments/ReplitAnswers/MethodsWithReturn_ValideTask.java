package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_ValideTask {

	  public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
		    // your code here
		  boolean app=false;

			  if (notEmpty==true) {
				  if (currentId==taskId-1) {
					  app=true;
				  } else {
					  app=false;
				  }
			  } else {
				  app=false;
			  }
			  return app;	    
		  }

		  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
			System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
			in.close();
		  }
		}