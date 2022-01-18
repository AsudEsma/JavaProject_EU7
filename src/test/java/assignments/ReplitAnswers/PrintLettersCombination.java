package assignments.ReplitAnswers;

public class PrintLettersCombination {

	  public static void main(String[] args) {
		  //WRITE YOUR CODE HERE
		  char a = 'z';
		  int n = 5;
		  int start = 0;
		  int round = 1;

		  while (start<5) {
			  for (int i=1; i<=n; i++) {
				  for (int j=1; j<2; j++) {
					  System.out.print((char)(a-start) + "" + (char)(a-i+round-start));
				  }
				  
				  System.out.println();
			  }
			  
			  start++;
			  round++;
		  }
	  }
}