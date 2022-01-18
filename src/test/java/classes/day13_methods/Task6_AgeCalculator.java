package classes.day13_methods;

public class Task6_AgeCalculator {

	public static void main(String[] args) {

		AgeCalculator(1993,2021);
		AgeCalculator(1887,1963);
		AgeCalculator(1463,1785);

	}
	
	public static void AgeCalculator(int birth, int date) {
		
		int age = date - birth;
		
		System.out.println(age);
	}

}
