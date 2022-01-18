package classes.day11_controlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {

		int i=0;
		while (i<=10) {
			System.out.println(i);
			i++;
		}

		
		int numberOfStudents = 1;
		
		while (numberOfStudents<=10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}
		
		int num = 11;
		while (num>=1) {
			System.out.print(num + " ");
			num--;
		}
		
	}

}
