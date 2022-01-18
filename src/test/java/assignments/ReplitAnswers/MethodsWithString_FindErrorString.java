package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_FindErrorString {
	
	public static boolean isError(String line) {

		String error = line.substring(0,5);
		if(error.equalsIgnoreCase("error")) {
			return true;
		} else {
			return false;
		}
	  }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(isError(in.nextLine()));
		in.close();
	}

}
