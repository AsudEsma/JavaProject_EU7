package assignments.Assignment_OOP_Concepts.Q08;

import java.util.Scanner;

public class Q8 {
    /**
     * Write a class definition of a class named 'Value' with the following:
     * a constructor accepting a single integer parameter
     * a constructor with no parameters
     * a method 'setVal' that accepts a single parameter,
     * a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
     * a method 'getVal' that returns an integer value as follows:
     * if setVal has ever been called, it getVal returns the last value passed to setVal.
     * Otherwise, if the "single int parameter" constructor was used to create the object,
     * getVal returns the value passed to that constructor.
     * Otherwise, getVal returns 0.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Value v = new Value(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
        v.setVal(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());

    }
}
