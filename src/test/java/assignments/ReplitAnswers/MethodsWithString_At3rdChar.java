package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_At3rdChar {
	
	public static String at3(String target,String word){
		
		String maniplator = target.substring(0,3)+word+target.substring(3);
		
		return maniplator;



	  }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(at3(in.next(), in.next()));

		in.close();	
		
	}
}
