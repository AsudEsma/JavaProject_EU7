package live_reviews_JAVA.week6_review;

public class A01_ArraysFundementals {

	public static void main(String[] args) {

		String city1 = "New York";
		String city2 = "Ankara";
		String city3 = "London";
		int count;
		
		String[] cities = new String[3];
		cities[0] = "New York";
		cities[1] = "Ankara";
		cities[2] = "London";
		
		String[] citiesMore = {"Istanbul", "Baku", "Berlin"};
		String[] citiesEvenMore = new String[] {"Izmir", "Amsterdam", "Venice"};

		System.out.println("The size of citiesMore: " + citiesMore.length);
		System.out.println("The first element is: " + citiesMore[0]);
		System.out.println("The last element is: " + citiesMore[cities.length-1]);
		
		count = citiesMore[0].length();
		System.out.println("The first element of the citiesMore has " + count + " letters");
		
		
		
		
		
	}

}
