package classes.day45_errorHandling;

public class TryCatchFinally {
    public static void main(String[] args) {

        String str = "Selenium";

        try {
            System.out.println(str.length());
            System.out.println(str.charAt(100));
        } catch (Exception e) {
            System.out.println("Enter correct an accurate index number");
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Byeeee...");
    }
}
