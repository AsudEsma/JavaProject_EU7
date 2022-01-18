package classes.day40_accessModifiers_hiding2;

import classes.day40_accessModifiers_hiding.Car;

public class Car2 extends Car {

	public Car2() {
		// only PUBLIC and PROTECTED can be accessed from a different package in inheritance relationship.
		// there is a hiding super(); 
		
	//	model = "M3";	// DEFAULT
		year = 2021;	// PUBLIC
	//	door = 2;		// PRIVATE
		engine = 4.8;	// PROTECTED
	}
}
