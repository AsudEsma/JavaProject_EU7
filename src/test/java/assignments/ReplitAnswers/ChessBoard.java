package assignments.ReplitAnswers;

import java.util.Arrays;

public class ChessBoard {

	public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    
	    for(int i=0; i<chessBoard.length; i++) {
	    	char let = 'a';
	    	for(int j=0; j<chessBoard[0].length; j++) {
	    		chessBoard[i][j] = i+1 + "" + let; //chessBoard[0][1] = 0+1 + b   
	    		let++;
	    	}
	    }
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));

	}
}
