package classes.day45_errorHandling;

public class OrCatchBlock {

    static String str = "abc";

    public static void main(String[] args) {

        try {
            System.out.println(str.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            // Exception types can not be sub-parent types
            e.printStackTrace();
        }
    }
}
