package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithArrays_tic_tac_toe {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    char [] game = new char[9];
	    for(int i=0; i < game.length; i++) {
	      game[i] = in.next().charAt(0);
	    }
	    
	    in.close();

	    System.out.println(won(game));
	  } 
	  
	  public static String won(char[] x){
	   
		  // Following 3s:
		  for(int i=0; i<x.length-2; i++) {
			  
			  if(i%3!=2 && x[i]!='-') {
				  
				  if(x[i]==x[i+1] && x[i]==x[i+2]) {
					  
					  return "Player " +x[i] + " won";
				  }
			  }
		  }
		  
		  // Down 3:
		  for(int i=0; i<3; i++) {
			  
			  if(x[i]==x[i+3] && x[i]==x[i+6] && x[i]!='-') {
				  
				  return "Player " +x[i] + " won";
			  }
		  }
		  
		  // Cross 3:
		  if(x[0]==x[4] && x[0]==x[8] && x[0]!='-') {
				  
			  return "Player " +x[0] + " won";
		  }
		  
		  if(x[2]==x[4] && x[2]==x[6] & x[2]!='-') {
			  
			  return "Player " +x[2] + " won";
		  }

		  return "No winners, please try again";
	  }
	  
	public static String wonArray(char[] x){
			  
		String[] board = new String[2];		// null
			  
		for(int i=0; i<x.length; i++) {
					  
			if(x[i]=='X') {					
				board[0] += ""+i;  //0236 -> null0236
						  
			} else if (x[i]=='O') { //1578 -> null1578
				board[1] += ""+i;
			}	  		  
		}
			  
		for(int i=0; i<8; i++) {
			if(board[0].contains(winners(i))) {
					  
				return "Player X won";
			}
				  
			if(board[1].contains(winners(i))) {
					  
				return "Player O won";
			}
		}
			  
		return "";
	}
		  
	public static String winners(int a){
			  
		switch (a) {
		case 0:
			return "012";
		case 1:
			return "345";
		case 2:
			return "678";
		case 3:
			return "036";
		case 4:
			return "147";
		case 5:
			return "258";
		case 6:
			return "148";
		default:
			return "246";  
		}

	}

}
