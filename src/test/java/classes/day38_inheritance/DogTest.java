package classes.day38_inheritance;

public class DogTest {

	public static void main(String[] args) {
	
		
		//who is job in java to init variables
		Dog d = new Dog(2, 4, 1, 20, "Long Silky");
		
		//print name
		System.out.println(d.getName());
		
		d.eat();
		d.move(10);
	}
}
