package classes.day37_inheritance;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Vakur";
		emp1.age = 31;
		emp1.gender = 'M';
		emp1.jobTitle = "SDET";
		
		emp1.work();
		emp1.eat("Brockoli");
		
//		emp1.attendClass();		// This is from Student class. You cannot use it under any other inherited class.
		
	}
}
