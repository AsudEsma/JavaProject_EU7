package assignments.Assignment_OOP_Concepts.Q01;

import java.util.Scanner;

public class Q1 {
    /**
     * The class Atts holds a few attributes and has a method called asString.
     * The attributes are name and color
     * -both are strings
     * and amount which is an int.
     * Their visibility is public.
     * asString returns a string showing all the Atts in a format.
     *** for example:
     * Atts a = new Atts();
     * a.name = "table";
     * a.color = "brown";
     * a.amount = 1;
     * System.out.println(a.asString());
     * name: table color: brown amount: 1
     * Create the required attributes and method inside the atts class
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.nextLine();
        a.color = in.nextLine();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }
}
