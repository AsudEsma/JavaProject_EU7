package classes.day41_abstraction;

public abstract class Bird extends Animal {

	@Override
	public void eat() {
		System.out.println("Bird is eating bird food.");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bird is breating.");
		
	}
	
	public abstract void fly();

	
}
