package classes.day26_arrays;

public class StringManupilationArrays {

	public static void main(String[] args) {

		String[] myCars = {"Honda","Mercedes","BMW","Toyota","   Ford   "};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2,3));
		System.out.println(myCars[1].equalsIgnoreCase(myCars[2]));
		System.out.println(myCars[1]==myCars[2]);
		
		System.out.println("--------------------");
	
		for(int i=0; i<myCars.length; i++) {
			System.out.println(myCars[i].length());
		}
		
		
		
	}

}
