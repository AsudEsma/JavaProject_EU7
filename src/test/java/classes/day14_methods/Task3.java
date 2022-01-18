package classes.day14_methods;

public class Task3 {

	public static void main(String[] args) {

		yearsUntilRetirement("Mike", 1975);
		yearsUntilRetirement("Asude", 1993);
		yearsUntilRetirement("Firdevs", 1969);
		yearsUntilRetirement("Bengi", 1989);
		yearsUntilRetirement("Fahreddin", 1994);

	}

	public static int calculateAge(int birthYear, int currentYear) {

		return currentYear - birthYear;
		
	}

	public static void yearsUntilRetirement(String name, int year) {

		int retirementAge = 65 - calculateAge(year, 2021);
		System.out.println(name + " retires in " + retirementAge + " years.");
		
	}
}
