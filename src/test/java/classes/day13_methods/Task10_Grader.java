package classes.day13_methods;

public class Task10_Grader {

	public static void main(String[] args) {

		calculateGrade(100,100,100);
		calculateGrade(50,65,45);

	}

	public static void calculateGrade(int a, int b, int c) {

		double sum = (a+b+c)/3;
		if (sum>=90 && sum<=100) {
			System.out.println("A");
		} else if (sum>=80 && sum<=89) {
			System.out.println("B");
		} else if (sum>=70 && sum<=79) {
			System.out.println("C");
		} else if (sum>=60 && sum<=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
