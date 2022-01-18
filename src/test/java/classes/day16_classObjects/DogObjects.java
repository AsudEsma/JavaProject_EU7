package classes.day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		System.out.println("*** DOG - 1 ***");
		dog1.age = 4;
		dog1.color = "Grey";
		dog1.breed = "Husky";
		dog1.name = "Hasbullah";

		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		System.out.println(dog1.name);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		System.out.println();
		
		System.out.println("*** DOG - 2 ***");	
		dog2.age = 5;
		dog2.color = "Ginger";
		dog2.breed = "Maltese";
		dog2.name = "Rover";

		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		System.out.println(dog2.name);
		
		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		System.out.println();
		
		System.out.println("*** DOG - 3 ***");	
		dog3.age = 11;
		dog3.color = "Brown";
		dog3.breed = "Chihuahua";
		dog3.name = "Milo";

		System.out.println(dog3.age);
		System.out.println(dog3.color);
		System.out.println(dog3.breed);
		System.out.println(dog3.name);
		
		dog3.barking();
		dog3.hungry();
		dog3.sleeping();

	}

}
