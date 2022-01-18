package classes.day23_Practice;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextLong());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextInt(3));

		System.out.println(rn.nextInt(10)+50);
		

	}

}
