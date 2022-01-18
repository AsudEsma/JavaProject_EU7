package classes.day26_arrays;

import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {

		System.out.println(findCar(3,"Honda"));

	}
	
	public static String[] createArray(int arraySize) {
		String[] myArray = new String[arraySize];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<myArray.length; i++) {
			System.out.print("Enter your car #" + (i+1) + " ");
			myArray[i] = scan.nextLine();
		}
		scan.close();
		return myArray;
		
	}
	
	public static boolean findCar (int carSize, String toFindCar) {
		
		for(String car : createArray(carSize)) {
			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
		}
		return false;
	}

}
