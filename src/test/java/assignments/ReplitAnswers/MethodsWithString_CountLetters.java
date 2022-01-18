package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_CountLetters {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println(countLetters(in.next()));
		System.out.println(countLetters("aaabbcdddd"));  // 3a2b1c4d
		in.close();
	  }
	  
	  public static String countLetters(String str){

		  String res = "";
		  
		  for(int i=0; i<str.length(); i++) {
			  if(!res.contains(""+str.charAt(i))) {
				  res += frequency(str, str.charAt(i)) + "" + str.charAt(i);
			  }
		  }
		  
		  return res;
	  }
	  
	  public static int frequency(String s, char c){
		    int count = 0;

		    for (int  i = 0; i < s.length(); i++){
		      if (s.charAt(i) == c){
		        count++;
		      }
		    }

		    return count;
	  }

}
