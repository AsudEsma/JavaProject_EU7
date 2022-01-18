package classes.day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner dad = new Dinner();
		Dinner kid = new Dinner();
		
		System.out.println("Total slices: " + mom.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total slices: " + dad.pizzaSlice);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		
//		mom.takeASlice();
		
		System.out.println("Total slices: " + kid.pizzaSlice);
		
		System.out.println(Math.PI);
	}
}
