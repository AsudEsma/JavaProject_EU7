package classes.day36_staticClassMembers;

import static java.lang.Math.*;	// import all static properties belong to Math Class

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		//You can directly bring the methods to your code
		
		System.out.println(sqrt(25));
		System.out.println(PI);
		System.out.println(sqrt(17.4));
				
	}
}
