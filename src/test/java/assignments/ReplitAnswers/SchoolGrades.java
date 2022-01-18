package assignments.ReplitAnswers;

import java.util.Scanner;

public class SchoolGrades {

	public static void main(String[] args) {

		String subject1, subject2, subject3, subject4, subject5;
	    double grade1, grade2, grade3, grade4, grade5, avarage;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Welcome to the Grader!");
	    System.out.println("Please enter subject name number 1 and score for this subject");
	    subject1 = sc.nextLine();
	    grade1 = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Please enter subject name number 2 and score for this subject");
	    subject2 = sc.nextLine();
	    grade2 = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Please enter subject name number 3 and score for this subject");
	    subject3 = sc.nextLine();
	    grade3 = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Please enter subject name number 4 and score for this subject");
	    subject4 = sc.nextLine();
	    grade4 = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Please enter subject name number 5 and score for this subject");
	    subject5 = sc.nextLine();
	    grade5 = sc.nextDouble();
	    sc.nextLine();

	    avarage = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
	    System.out.println("Summary: " + subject1 + " - " + grade1 + ", " + subject2 + " - " + grade2 + ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4 + ", " + subject5 + " - " + grade5);
	    System.out.println("Your average score is: " + avarage);
	    System.out.println("Thank you for using Grader!");
	    System.out.println("Goodbye!");
	    
	    sc.close();

	}

}
