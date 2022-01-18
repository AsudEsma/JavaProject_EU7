package classes.day08_controlFlowStatements;

public class task7_ifElse_ifElse {

	public static void main(String[] args) {

		int math, biology, chemistry;
		double average;
		
		math = 100;
		biology = 80;
		chemistry = 55;
		average = (math+biology+chemistry)/3;
		System.out.println("Average is " + average);
		
		if (average<60) {
			System.out.println("Grade is F");
		} else if (average==60 && average<70) {
			System.out.println("Grade is D");
		} else if (average>=70 && average<80) {
			System.out.println("Grade is C");
		} else if (average>=80 && average<90) {
			System.out.println("Grade is B");
		} else if (average>=90 && average<=100) {
			System.out.println("Grade is A");
		}

	}

}
