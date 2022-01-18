package assignments.ReplitAnswers;

public class MethodsWithArrays_tic_tac_toe2 {

	public static void main(String[] args) {
	    char [] game = {'X', 'O', 'X',
	    		  		'X', '-', '-',
	    		  		'X', 'O', '-'};
	    
	    System.out.println(won(game));
	  }

	
	public static String won(char[] x){

		  String[] board = new String[2]; // null
		  
		  for(int i=0; i<x.length; i++) {
				  
			if(x[i]=='X') {
				board[0] += ""+i;  // null012
					  
			} else if (x[i]=='O') {
				board[1] += ""+i;	//null47
			}
			  		  
		  }
		  
//		  System.out.println(Arrays.deepToString(board));
		  System.out.println(board[0]);
		  System.out.println(board[1]);
		  
		  for(int i=0; i<8; i++) {
			  if(board[0].contains(winners(i))) { // for X
				  
				  return "Player X won";
			  }
			  
			  if(board[1].contains(winners(i))) { // for O
				  
				  return "Player O won";
			  }
		  }
		  
		  return "No winners";
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
			  return "048";
		  default:
			  return "246";  
		  }

	  }

}
