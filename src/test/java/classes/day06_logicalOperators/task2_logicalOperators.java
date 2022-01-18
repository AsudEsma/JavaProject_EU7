package classes.day06_logicalOperators;

public class task2_logicalOperators {

	public static void main(String[] args) {

		String OutSideWeather;
		int Degree;
		OutSideWeather = "Shinny";
		Degree = 70;
		boolean comp2 = (!(OutSideWeather=="Rainy"||Degree==70));
		
		// ! ((F || T) = T) = F
		
		System.out.println(comp2);

	}

}
