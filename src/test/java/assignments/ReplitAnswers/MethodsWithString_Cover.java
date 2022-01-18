package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_Cover {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println(coverString(in.nextLine(), in.nextLine()));
	    in.close();
	}
	  
	public static String coverString(String main, String coverME) {
		// your code here
		String highlight = "";
		for(int i=0; i<main.length()-coverME.length(); i++) {
			if(coverME.equalsIgnoreCase(main.substring(i, i+coverME.length()))) {
				highlight = main.replace(coverME, "["+coverME+"]");
			}
		}
		
		if(main.equals(highlight) || highlight.equals("")) {
			highlight = main.replace(main, "["+main+"]");
		}
		
		return highlight;
	}
}
