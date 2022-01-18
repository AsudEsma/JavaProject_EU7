package classes.day04_arithmeticOperations;

public class task10_typesOfCastings {

	public static void main(String[] args) {

		int pies=10, people=4;
		double piesPerson;
		piesPerson=pies/people; // int/int=int
		
		System.out.println("The answer is " + piesPerson);
		System.out.println();
		
		int pearls=10, peeps=4;
		double pearlsPeeps;
		pearlsPeeps=(double)pearls/peeps; // double/int=double
		
		System.out.println("The answer is " + pearlsPeeps);
		System.out.println();
		
		int pi=10, poo=4;
		double piPoo;
		piPoo=pi/(double)poo; // int/double=double
		
		System.out.println("The answer is " + piPoo);
		System.out.println();
	
		int pee=10, pepe=4;
		double peePepe;
		peePepe= (double)(pee/pepe); // (double) int/int=int
		
		System.out.println("The aswer is " + peePepe);
		
	}

}
