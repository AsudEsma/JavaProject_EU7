package classes.day40_accessModifiers_hiding;

public class Rodent {

	protected int tailLenght = 4;
	
	public void getRodentDetails() {
		System.out.println("parentTail: " + tailLenght);
	}
}
