package classes.day26_arrays;

import java.util.Arrays;

public class Task2_SearchResult {

	public static void main(String[] args) {

		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		String[] infoArray1 = info1.split("password :");
		String[] infoArray2 = info2.split("password :");
		
		System.out.println(Arrays.toString(infoArray1));
		System.out.println(Arrays.toString(infoArray2));
		
		String pass1 = infoArray1[1].split(". Please")[0];
		System.out.println(pass1);
		
		String pass2 = infoArray2[1].split(". Please")[0];
		System.out.println(pass2);
		
		pass1 = pass1.trim().substring(3,9);
		pass2 = pass2.trim().substring(3,9);
		
		System.out.println(pass1);
		System.out.println(pass2);
		
	}

}
