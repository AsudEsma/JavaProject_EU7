package classes.day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		ABC.m1();
//		ABC obj1 = new ABC();	// You got an ERROR because the constructor is private.
//		obj1.m1();
		
		// Whenever all your methods are STATIC in your class, and you want everyone to call them only in static way
		// == Classname.methodname(); then you can simply make your constructor PRIVATE.
	}
	
	public static void print() {
//		int static a = 5;		// local variables cannot be static! Because STATIC means accessible for everyone.
								// But local variables are only accessible in the exact method they are in.
	}
}
