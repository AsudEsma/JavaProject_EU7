package live_reviews_JAVA.week2_review;

public class task3_QuestonFromDiscord {

	public static void main(String[] args) {

		int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        //Because && is firstly done by the compiler,
        
        /* From highest to lowest:
         *      -(unary negation), !
         *      * / %
         *      + -
         *      < > <= >=
         *      == !=
         *   	&&
         *   	||
         *   	= += -+ *= %=
         *   
         * ++b==2 -> b=3; But the compiler will do the && first
         * --b==2 -> 2==2 -> true b=2
         * --b==1 -> 1==2 -> false b=1
         * ++b==2 -> 1==2 -> false //But ++b will not add another +1 since it did the first place.
         */
        
        System.out.println(res);
        System.out.println(b);
        
	}

}
