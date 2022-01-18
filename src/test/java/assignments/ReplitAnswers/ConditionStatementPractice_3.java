package assignments.ReplitAnswers;

import java.util.Scanner;

public class ConditionStatementPractice_3 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
	  	String name = inp.nextLine();

	  	switch (name) {
	  	case "Chen":
	  		System.out.println("teacher");
	  		break;
	  	default:
	  		System.out.println("student");
	  		break;
	  	}
	  	
	  	inp.close();
	}

}
