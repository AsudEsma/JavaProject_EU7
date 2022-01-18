package live_reviews_JAVA.week7_review;

import java.util.Arrays;

public class R03_isAnagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen  ", "silent"));
		
	}
	
	public static boolean isAnagram (String str1, String str2) {
		
		boolean isAnagram = false;
		
		if(str1.length()!=str2.length()) {
			return isAnagram;
			
		} else {
			str1 = str1.toLowerCase().replaceAll(" ", "");
			str2 = str2.toLowerCase().replaceAll(" ", "");
			
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			if(Arrays.equals(charArr1, charArr2)) {
				isAnagram = true;
			}
		}
		
		return isAnagram;
	}
}
