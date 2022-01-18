package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_ThunderBlazz {

	  public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
			  , int ingredient2, int ingredient3){
			    
		  if (available || gift) {
			  return true;
		  } else if (ingredient1==1 && ingredient2==2 && ingredient3==3) {
			  return true;
		  } else if (ingredient1==3 && ingredient2==1 && ingredient3==2) {
			  return true;
		  } else {
			  return false;
		  }
	    
	  }

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
			in.close();
		}
	}
