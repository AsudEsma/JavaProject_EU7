package classes.day40_accessModifiers_hiding;

public class Mouse extends Rodent {

	protected int tailLenght = 8;
	
	public void getMouseDetails() {
		System.out.println("tail: " + tailLenght + ", parentTail: " + super.tailLenght);
		// We cannot override the instance variables. But we can call the parent class variables with
		// the SUPER keyword. Now we can access the parent tailLenght variable.
	}
}
