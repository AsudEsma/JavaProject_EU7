package classes.day14_methods;

public class Task1 {

	public static void main(String[] args) {

		System.out.println(distance(120,3));

	}
	
	public static int distance(int speed, int time) {
		
		int distance = speed * time;
		
		return distance;
	}

}
