package classes.day40_accessModifiers_hiding;

public class Marsupial {

	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs: " + isBiped());
	}
	
	
}
