package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_BiggerString {
	
	public static String bigger(String a ,String b){
	
		if(a.length()>b.length()) {
			return a;
		} else {
			return b;
		}
	 
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(bigger(in.next(), in.next()));
		in.close();	
	  }
}
