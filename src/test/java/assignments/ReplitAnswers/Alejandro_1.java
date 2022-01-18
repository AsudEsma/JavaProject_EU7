package assignments.ReplitAnswers;

import java.util.Scanner;

public class Alejandro_1 {
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String a = s.nextLine();

	    //your code here
	    if(a.contains("alejandro")) {
	    	System.out.println("read");
	    } else {
	    	System.out.println("don't read");
	    }
	    s.close();
	}
}
