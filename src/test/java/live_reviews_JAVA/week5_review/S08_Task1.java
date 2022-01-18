package live_reviews_JAVA.week5_review;

public class S08_Task1 {

	public static void main(String[] args) {

		System.out.println(frequency("aabcccd", 'a'));
		
		String s1 = "aabcccd";
		System.out.print("Unique chars in this input are: ");
		System.out.println(uniqueCharacters(s1));
		
		String s2 = "asude esma ozdemir is a java master";
		System.out.print("Unique chars in this input are: ");
		System.out.println(uniqueCharacters(s2));
		
		System.out.print("Removing duplicate chars no.1: ");
		System.out.println(removeDuplicate1("aaaa, b, cccccc, sss"));
		System.out.print("Removing duplicate chars no.2: ");
		System.out.println(removeDuplicate2("aaaa, b, cccccc, sss"));
		
		System.out.print("The frequency of chars are: ");
		System.out.println(frequencyOfChar("aabcccd"));
		
		String sentence = "I am a experinced tester. As a tester I can automate browsers."
				+ " I can test API and DB.";
		String word = "test";
		System.out.print("The frequency of the word \"" + word + "\" is: ");
		System.out.println(frequencyOfWord(sentence, word));
	}
	
	public static int frequency(String str, char c) {
		int frq = 0;

		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==c) {
				frq++;
			}
		}
			
		return frq;
		
	}
	
	public static String uniqueCharacters(String str) {
		String result = "";
		for (int i=0; i<str.length(); i++)
		if(frequency(str, str.charAt(i))==1) {
			result += str.charAt(i);
		}
		
		return result;
	}
	
	public static String removeDuplicate1(String str) {
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			String each = ""+str.charAt(i);
			if(result.contains(each)) {
				continue;
			} else {
				result+=each;
			}
		} 
		result = result.replace(" ", "").replace(",", "");
		return result;
	}
	
	public static String removeDuplicate2(String str) {
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			String each = ""+str.charAt(i);
			if(!result.contains(each)) {
				result+=each;
			}
		} 
		result = result.replace(" ", "").replace(",", "");
		return result;
	}
	
	public static String frequencyOfChar(String str) {
		String result = "";
		
		if(str.length()<2) {
			result+=""+str.charAt(0) + " : " + 1;
		} else {
			for(int i=0; i<str.length(); i++) {
				String each = "" + str.charAt(i);
				if (!result.contains(""+each)) {
					result+=each + " : " + frequency(str, str.charAt(i)) + " | ";
				}
			}

		}
		
		return result.substring(0, result.length()-3);
	}
	
	public static int frequencyOfWord (String str, String word) {
		int count = 0;
		for (int i=0; i<=str.length()-word.length(); i++) {
			if(str.substring(i, i+word.length()).equalsIgnoreCase(word)) {
				count++;
			}
		}
		
		return count;
	}

}
