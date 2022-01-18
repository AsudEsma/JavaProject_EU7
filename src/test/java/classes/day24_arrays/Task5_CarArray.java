package classes.day24_arrays;

public class Task5_CarArray {

	public static void main(String[] args) {

		String[] cars = {"Ferrari","Toyota","Nissan","BMW","Mercedes","Honda"};
		
		boolean flag = false;
		
		for(int i=0; i<cars.length; i++) {
			if(cars[i].equalsIgnoreCase("Honda")) {
				flag = true;
				break;
			}
		}
			
		if (flag) {
			System.out.println("I found your car Honda is this array.");
		} else {
			System.out.println("I could not find your car Honda in this array.");
		}


	}

}
