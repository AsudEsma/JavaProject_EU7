package classes.day40_accessModifiers_hiding;

public class Kangaroo extends Marsupial {

	@Override
	public boolean isBiped() {
		return true;
	}
	
	public void getKangarooDecription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
}
