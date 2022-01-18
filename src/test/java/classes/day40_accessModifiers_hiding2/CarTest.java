package classes.day40_accessModifiers_hiding2;

import classes.day40_accessModifiers_hiding.Car;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car c = new Car();
	//	c.model = "M3";		// DEFAULT
		c.year = 2021; 		// only PUBLIC can be accessed from a different package.
	//	c.door = 2;			// PRIVATE
	//	c.engine = 4.8;		// PROTECTED
		
		c.hashCode();
		
	}

}
