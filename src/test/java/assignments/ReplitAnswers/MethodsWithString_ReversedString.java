package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_ReversedString {
	
	public static String reverse(String input){
		
		String reversed = "";
		for(int i=input.length()-1; i>=0; i--) {
			reversed += "" + input.charAt(i);
		}
		
		return reversed;	     
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(reverse(in.next()));
		in.close();
  }

}
