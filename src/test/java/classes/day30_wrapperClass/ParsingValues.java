package classes.day30_wrapperClass;

public class ParsingValues {
	
	public static void main(String[] args) {
		
		// Converting to Integer
		String numberAsString = "2018";
		System.out.println(numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println(number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println(numberAsString);
		System.out.println(number);
		
		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		// Converting to String
		int i = 10;
		String s = String.valueOf(i);
		System.out.println(s);
		s += 1;
		System.out.println(s);
		
		String s2 = Integer.toString(i);
		System.out.println(s2);
		s2 += 1;
		System.out.println(s2);
	}

}
