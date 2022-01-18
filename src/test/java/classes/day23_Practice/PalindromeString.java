package classes.day23_Practice;

public class PalindromeString {

	public static void main(String[] args) {

	    String str = "level";
        String str1 = "levelli";
        
        StringBuilder sb = new StringBuilder(str);
     
        if(str.equals(sb.reverse().toString())) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        
        if(str1.equals(sb.reverse().toString())) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

	}

}
