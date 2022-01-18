package classes.day34_constructor;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		Dice sixDice = new Dice(SIX_SIDES);
		RollDice(sixDice);
	}
	
	public static void RollDice(Dice d1) {
		System.out.println("Rolling a " + d1.getSides() + " sided dice");
		
		System.out.print("The dice's value : " + d1.getValue()); 
	}
}
