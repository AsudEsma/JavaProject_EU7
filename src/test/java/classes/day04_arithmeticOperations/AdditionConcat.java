package classes.day04_arithmeticOperations;

public class AdditionConcat {

	public static void main(String[] args) {
		
		//Number + Number = Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number + String : Concatenation
		System.out.println(5 + "hello");
		
		//String + Boolean : Concatenation
		System.out.println("hello" + true);
		
		//String + String : Concatenation
		System.out.println("hello" + "World");
		
		//Boolean + Number
		//System.out.println(true+1);
		
		//Some Examples and Explanations:
		
		System.out.println(2+0+3+"Cybertek"); //Number+Number+Number+String
		System.out.println("Cybertek" +2+0+5); //((String+Number=String)+Number=String)+Number=String
		System.out.println(2+0+5+"Cybertek"+2+0+5); //Number+Number+Number+((String+Number=String)+Number=String)+Number=String
		System.out.println(2+0+5+"Cybertek"+(2+0+5)); //Number+Number+Number+ String + (Number+Number+Number)
		
		
		
		

	}

}
