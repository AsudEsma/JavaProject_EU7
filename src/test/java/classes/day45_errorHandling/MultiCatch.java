package classes.day45_errorHandling;

public class MultiCatch {
    public static void main(String[] args) {

        // First Catch:

        try {
            System.out.println(4/0);

            String str = null;
            System.out.println(str.toLowerCase());

            int[] n= {10,4};
            System.out.println(n[2]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception happened...");
        } catch (NullPointerException e) {
            System.out.println("NullPointer exception happened...");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        // Second Catch:

        try {
            System.out.println(4/1);

            String str = null;
            System.out.println(str.toLowerCase());

            int[] n= {10,4};
            System.out.println(n[2]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception happened...");
        } catch (NullPointerException e) {
            System.out.println("NullPointer exception happened...");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        // Third Catch:

        try {
            System.out.println(4/1);

            String str = "Asu";
            System.out.println(str.toLowerCase());

            int[] n= {10,4};
            System.out.println(n[2]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception happened...");
        } catch (NullPointerException e) {
            System.out.println("NullPointer exception happened...");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
