package classes.day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many questions are on the final exam?");
		int Qnum = scan.nextInt();
		System.out.println("How many of them was missed?");
		int missed = scan.nextInt();
		scan.close();
		FinalExam fn = new FinalExam(Qnum,missed);
		
		System.out.println("The grade is " + fn.getGrade());
		
	}
}
