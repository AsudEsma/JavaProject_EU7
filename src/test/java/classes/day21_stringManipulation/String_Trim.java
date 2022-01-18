package classes.day21_stringManipulation;

public class String_Trim {

	public static void main(String[] args) {
			
		String s1 = "         Programing is fun";
		System.out.println(s1.trim());
		
		String s2 = "Programing is fun      ";
		System.out.println(s2.trim());
		
		String s3 = "   Programing is fun    ";
		System.out.println(s3.trim());
		
		String str = " 342 ";  //|342|
		System.out.println("|"+str.trim()+"|");

	}

}
