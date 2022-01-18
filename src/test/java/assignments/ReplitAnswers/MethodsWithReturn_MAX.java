package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_MAX {

	  public static int max(int x, int max){
		    // Code here
			  if (x>max) {
				  return x;
			  } else if (max>x) {
				  return max;
			  } else {
				  return x;
			  }
		  }

		  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    System.out.println(max(in.nextInt(), in.nextInt()));
		    in.close();
		  }

		}
