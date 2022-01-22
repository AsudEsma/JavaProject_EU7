package classes.day45_errorHandling;

import java.util.Locale;

public class NullPointer {

    static String name;

    public static void main(String[] args) {

        try {
            System.out.println(name.toUpperCase());
        } catch (Exception e) {
            System.out.println("Nullpointerexception happened");
            System.out.println("Here is the message: " + e.getMessage());
            System.out.println("Here is the stack trace:");
            e.printStackTrace();
        }
    }
}
