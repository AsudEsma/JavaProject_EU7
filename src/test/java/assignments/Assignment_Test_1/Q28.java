package assignments.Assignment_Test_1;

public class Q28 {

	public static void main(String[] args) {

		char grade = 'A';
		boolean Passed = grade == 'A' || grade == 'B';
		boolean Passed2 = grade == 'C' || grade == 'D';
		
		if (Passed || Passed2) {
			System.out.println("You've");
		} else {
			System.out.println("You failed");
		}
	}

}
