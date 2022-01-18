package classes.day23_Practice;

public class Lab3_Q12 {

	public static void main(String[] args) {

		System.out.println(CatDog("catdog"));
		System.out.println(CatDog("catcat"));
		System.out.println(CatDog("dogdog"));
		System.out.println(CatDog("lots of cats and some dogs"));
		System.out.println(CatDog("no dogs but so many cats, cats everywhere"));
		
		

	}
	
	public static boolean CatDog (String str) {
		
		int counterDog = 0, counterCat = 0;
		
		for (int i=0; i<str.length()-2;i++) {
			if ("cat".equals(str.substring(i, i+3))) {
				counterCat++;
			} else if ("dog".equals(str.substring(i, i+3))) {
				counterDog++;
			}
		}
		
		if (counterDog == counterCat) {
			return true;
		} else {
			return false;
		}
	}

}
